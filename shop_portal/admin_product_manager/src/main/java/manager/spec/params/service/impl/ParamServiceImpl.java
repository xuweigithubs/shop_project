package manager.spec.params.service.impl;
import com.google.gson.Gson;
import manager.common.PageView;
import manager.spec.group.dao.SpecGroupDao;
import manager.spec.group.vo.SpecGroupVO;
import manager.spec.params.dao.ParamDao;
import manager.spec.params.service.ParamService;
import manager.spec.params.vo.SpecParamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service(value = "paramService")
public class ParamServiceImpl implements ParamService {
    @Autowired
    private ParamDao paramDao;
    @Autowired
    private SpecGroupDao specGroupDao;

    public PageView<List<SpecParamVO>> selectByConditionPage(SpecParamVO specParamVO) {
        PageView<List<SpecParamVO>> PageView=new PageView<List<SpecParamVO>>();
        List<SpecParamVO> rows= paramDao.selectByConditionPage(specParamVO);
        Integer count=paramDao.selectByConditionCount(specParamVO);
        PageView.setRows(rows);
        PageView.setTotal(count);
        return PageView;
    }

    @Override
    public void saveParam(SpecParamVO specParamVO) {
        paramDao.saveParam(specParamVO);
    }

    @Override
    public void deleteParam(Integer[] ids) {
        paramDao.deleteParam(ids);
    }

    @Override
    public void updateParam(SpecParamVO specParamVO) {
        paramDao.updateParam(specParamVO);
    }
    public void updateParamByIds(SpecParamVO specParamVO){
        //更新完规格参数后，需要同步更新规格参数模板
        paramDao.updateParamByIds(specParamVO);
        //查询当前组属于哪个分类
        SpecGroupVO specGroupVO=new SpecGroupVO();
        specGroupVO.setId(specParamVO.getGroupId());
        List<SpecGroupVO> specGroupList=specGroupDao.selectByCondition(specGroupVO);
        //查询当前分类下所有的分组
        if(specGroupList.size()>0){
            SpecGroupVO currentGroup=specGroupList.get(0);
            //获取分类id
            String cid=currentGroup.getCid();
            //根据cid查询所所有分组
            specGroupVO=new SpecGroupVO();
            specGroupVO.setCid(cid);
            List<SpecGroupVO> categorySpecGroupList=specGroupDao.selectByCondition(specGroupVO);
            //拿出所有组的id,进行批量查询组下面的规格参数
            List<String> groupIds=categorySpecGroupList.parallelStream().map(SpecGroupVO::getId).collect(Collectors.toList());
            specParamVO=new SpecParamVO();
            specParamVO.setGroupIds(groupIds);
            //查询所有规格参数
            List<SpecParamVO> specParamsList=paramDao.selectByCondition(specParamVO);
            List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
            categorySpecGroupList.forEach(item->{
                Map<String,Object> map=new LinkedHashMap<String,Object>();
                List<String> paramNameList=specParamsList.stream().filter(curItem->{
                    if(null==curItem.getGroupId()){
                        return false;
                    }
                    return curItem.getGroupId().equals(item.getId());
                }).map(SpecParamVO::getName).collect(Collectors.toList());
                map.put("group",item.getName());
                map.put("params",paramNameList);
                list.add(map);
            });
            Gson gson=new Gson();
            String tempStr=gson.toJson(list);
            
        }
    }
}
