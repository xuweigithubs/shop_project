package manager.spec.params.dao;
import manager.spec.params.vo.SpecParamVO;
import java.util.List;
public interface ParamDao {
    //根据名称搜索规格参数
    List<SpecParamVO> selectByConditionPage(SpecParamVO specParamVO);
    //根据条件统计规格参数
    Integer selectByConditionPageCount(SpecParamVO specParamVO);
}
