package manager.spec.params.service.impl;
import com.google.gson.Gson;
import manager.common.PageView;
import manager.spec.group.dao.SpecGroupDao;
import manager.spec.group.dao.SpecificationDao;
import manager.spec.group.vo.SpecGroupVO;
import manager.spec.group.vo.SpecificationVO;
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
    @Autowired
    private SpecificationDao specificationDao;

    public PageView<List<SpecParamVO>> selectByConditionPage(SpecParamVO specParamVO) {
        PageView<List<SpecParamVO>> PageView=new PageView<List<SpecParamVO>>();
        List<SpecParamVO> rows= paramDao.selectByConditionPage(specParamVO);
        Integer count=paramDao.selectByConditionCount(specParamVO);
        PageView.setRows(rows);
        PageView.setTotal(count);
        return PageView;
    }
    //添加规格参数的时候也需要
    @Override
    public void saveParam(SpecParamVO specParamVO) {
        paramDao.saveParam(specParamVO);
        saveParamTemplate(specParamVO);
    }


    @Override
    public void deleteParam(Integer[] ids) {
        SpecParamVO specParamVO=new SpecParamVO();
        specParamVO.setId(String.valueOf(ids[0]));
        List<SpecParamVO> specParamsList=paramDao.selectByCondition(specParamVO);
        paramDao.deleteParam(ids);
        specParamVO.setCid(specParamsList.get(0).getCid());
        saveParamTemplate(specParamVO);
    }

    @Override
    public void updateParam(SpecParamVO specParamVO) {
        paramDao.updateParam(specParamVO);
        saveParamTemplate(specParamVO);
    }

    public void updateParamByIds(SpecParamVO specParamVO){
        //更新完规格参数后，需要同步更新规格参数模板
        paramDao.updateParamByIds(specParamVO);
        saveParamTemplate(specParamVO);
    }

    private void saveParamTemplate(SpecParamVO specParamVO) {
        //查询当前组属于哪个分类
        SpecGroupVO specGroupVO=new SpecGroupVO();
        specGroupVO.setId(specParamVO.getGroupId());
        String cid = specParamVO.getCid();
        //根据cid查询所所有分组
        specGroupVO=new SpecGroupVO();
        specGroupVO.setCid(cid);
        List<SpecGroupVO> categorySpecGroupList=specGroupDao.selectByCondition(specGroupVO);
        //拿出所有组的id,进行批量查询组下面的规格参数
        List<String> groupIds=categorySpecGroupList.parallelStream().map(SpecGroupVO::getId).collect(Collectors.toList());
        specParamVO=new SpecParamVO();
        specParamVO.setCid(cid);
        specParamVO.setGroupIds(groupIds);
        //查询所有规格参数
        List<SpecParamVO> specParamsList=paramDao.selectByCondition(specParamVO);
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        Map<String,Object> result=new LinkedHashMap<String,Object>();
        categorySpecGroupList.forEach(item->{
            Map<String,Object> map=new LinkedHashMap<String,Object>();
            List<SpecParamVO> paramNameList=specParamsList.stream().filter(curItem->{
                if(null==curItem.getGroupId()){
                    return false;
                }
                return curItem.getGroupId().equals(item.getId());
            }).collect(Collectors.toList());
            if(paramNameList.size()>0){
                map.put("group",item.getName());
                map.put("params",paramNameList);
                list.add(map);
            }
        });
        result.put("groupParams",list);
        //找到当前分类下没有关联分组的参数
        List<SpecParamVO> noReleateResult=specParamsList.stream().filter(item->item.getGroupId()==null).collect(Collectors.toList());
        result.put("params",noReleateResult);
        Gson gson=new Gson();
        String tempStr=gson.toJson(result);
        SpecificationVO specificationVO=new SpecificationVO();
        specificationVO.setCategoryId(cid);
        specificationVO.setSpecifications(tempStr);
        specificationDao.deleteByCondition(specificationVO);
        specificationDao.add(specificationVO);
    }
}
