package manager.spec.group.dao;

import manager.spec.group.vo.SpecGroupVO;

import java.util.List;

public interface SpecGroupDao {
    //根据名称搜索参数组
    List<SpecGroupVO> selectByCondition(SpecGroupVO specGroupVO);
    //添加分组
    void addSpecGroup(SpecGroupVO specGroupVO);
    //修改分组
    void updateSpecGroup(SpecGroupVO specGroupVO);
    //删除参数组
    void deleteSpecGroup(Integer[] ids);
    //统计查询结果的条数
    Integer selectByConditionCount(SpecGroupVO specGroupVO);
}
