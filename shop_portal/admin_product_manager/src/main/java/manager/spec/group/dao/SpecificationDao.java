package manager.spec.group.dao;

import manager.spec.group.vo.SpecGroupVO;
import manager.spec.group.vo.SpecificationVO;
import java.util.List;

public interface SpecificationDao {
    //根据名称搜索参数组
    List<SpecGroupVO> selectByCondition(SpecificationVO specificationVO);
    //添加分组
    void add(SpecificationVO specificationVO);
    //修改分组
    void updateByCondition(SpecificationVO specificationVO);
    //根据条件删除
    void deleteByCondition(SpecificationVO specificationVO);
}
