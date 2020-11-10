package manager.spec.group.service;
import manager.spec.group.vo.SpecGroupVO;
import java.util.List;

public interface ParamGroupService {
    //获取规格参数组
    public List<SpecGroupVO> selectByCondition(SpecGroupVO specGroupVO);
}
