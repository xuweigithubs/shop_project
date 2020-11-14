package manager.spec.group.service;
import manager.spec.group.vo.SpecGroupVO;

import java.lang.reflect.Array;
import java.util.List;

public interface ParamGroupService {
    //获取规格参数组
    public List<SpecGroupVO> selectByCondition(SpecGroupVO specGroupVO);
    //添加规格参数组
    public void  addSpecGroup(SpecGroupVO specGroupVO);
    //根据ID修改参数组
    public void updateSpecGroup(SpecGroupVO specGroupVO);
    //删除参数组
    public void deleteSpecGroup(Integer[] ids);
}
