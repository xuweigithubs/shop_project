package manager.spec.params.service;
import manager.common.PageView;
import manager.spec.params.vo.SpecParamVO;
import java.util.List;
public interface ParamService {
    //分页获取规格参数信息
    public PageView<List<SpecParamVO>> selectByConditionPage(SpecParamVO specParamVO);
    //保存规格参数信息
    void saveParam(SpecParamVO specParamVO);
    //删除规格参数信息
    void deleteParam(Integer[] ids);
    //修改规格参数
    void updateParam(SpecParamVO specParamVO);
}
