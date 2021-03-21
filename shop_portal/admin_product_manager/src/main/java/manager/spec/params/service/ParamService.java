package manager.spec.params.service;
import manager.common.PageView;
import manager.spec.params.dao.ParamDao;
import manager.spec.params.vo.SpecParamVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ParamService {
    @Autowired
    private ParamDao paramDao;
    public PageView<List<SpecParamVO>> selectByConditionPage(SpecParamVO specParamVO) {
        PageView<List<SpecParamVO>> PageView=new PageView<List<SpecParamVO>>();
        List<SpecParamVO> rows= paramDao.selectByConditionPage(specParamVO);
        Integer count=paramDao.selectByConditionPageCount(specParamVO);
        PageView.setRows(rows);
        return PageView;
    }
}
