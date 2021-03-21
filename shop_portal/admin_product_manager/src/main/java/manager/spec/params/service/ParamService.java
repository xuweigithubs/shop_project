package manager.spec.params.service;
import manager.common.PageView;
import manager.spec.params.vo.SpecParamVO;
import java.util.List;
public interface ParamService {
    public PageView<List<SpecParamVO>> selectByConditionPage(SpecParamVO specParamVO);
}
