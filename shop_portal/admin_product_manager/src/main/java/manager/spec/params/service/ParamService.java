package manager.spec.params.service;
import manager.common.PageView;
import manager.spec.group.vo.SpecificationVO;
import manager.spec.params.vo.SpecParamVO;
import java.util.List;
import java.util.Map;

public interface ParamService {
    //分页获取规格参数信息
    public PageView<List<SpecParamVO>> selectByConditionPage(SpecParamVO specParamVO);
    //保存规格参数信息
    void saveParam(SpecParamVO specParamVO);
    //删除规格参数信息
    void deleteParam(Integer[] ids);
    //修改规格参数
    void updateParam(SpecParamVO specParamVO);
    //根据groupId批量修改
    void updateParamByIds(SpecParamVO specParamVO);
    //查询当前分类下的规格参数模板
    List<SpecificationVO> getParamsTemplate(SpecificationVO specificationVO);

}
