package manager.spec.group.service.impl;
import manager.spec.group.dao.SpecGroupDao;
import manager.spec.group.service.ParamGroupService;
import manager.spec.group.vo.SpecGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service(value = "paramGroupService")
public class ParamGroupServiceImpl implements ParamGroupService {
    @Autowired
    private SpecGroupDao specGroupDao;
    //获取规格参数组
    public List<SpecGroupVO> selectByCondition(SpecGroupVO specGroupVO){
        return specGroupDao.selectByCondition(specGroupVO);
    }
    //添加参数组
    @Override
    public void addSpecGroup(SpecGroupVO specGroupVO) {
        specGroupDao.addSpecGroup(specGroupVO);
    }
    //根据ID修改参数组
    @Override
    public void updateSpecGroup(SpecGroupVO specGroupVO) {
        specGroupDao.updateSpecGroup(specGroupVO);
    }
    //删除参数组
    @Override
    public void deleteSpecGroup(Integer[] ids) {
        specGroupDao.deleteSpecGroup(ids);
    }
}
