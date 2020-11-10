package manager.spec.group.dao;

import manager.spec.group.vo.SpecGroupVO;

import java.util.List;

public interface SpecGroupDao {
    List<SpecGroupVO> selectByCondition(SpecGroupVO specGroupVO);
}
