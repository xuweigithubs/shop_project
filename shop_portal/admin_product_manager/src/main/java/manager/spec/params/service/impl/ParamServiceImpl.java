package manager.spec.params.service.impl;
import manager.common.PageView;
import manager.spec.params.dao.ParamDao;
import manager.spec.params.service.ParamService;
import manager.spec.params.vo.SpecParamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service(value = "paramService")
public class ParamServiceImpl implements ParamService {
    @Autowired
    private ParamDao paramDao;
    public PageView<List<SpecParamVO>> selectByConditionPage(SpecParamVO specParamVO) {
        PageView<List<SpecParamVO>> PageView=new PageView<List<SpecParamVO>>();
        List<SpecParamVO> rows= paramDao.selectByConditionPage(specParamVO);
        Integer count=paramDao.selectByConditionCount(specParamVO);
        PageView.setRows(rows);
        PageView.setTotal(count);
        return PageView;
    }

    @Override
    public void saveParam(SpecParamVO specParamVO) {
        paramDao.saveParam(specParamVO);
    }

    @Override
    public void deleteParam(Integer[] ids) {
        paramDao.deleteParam(ids);
    }

    @Override
    public void updateParam(SpecParamVO specParamVO) {
        paramDao.updateParam(specParamVO);
    }
    public void updateParamByIds(SpecParamVO specParamVO){
        paramDao.updateParamByIds(specParamVO);
    }
}
