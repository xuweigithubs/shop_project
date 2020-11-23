package manager.brand.service.impl;

import manager.brand.dao.BrandDao;
import manager.brand.service.BrandService;
import manager.brand.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "brandService")
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;
    @Override
    public List<BrandVO> selectByCondition(BrandVO brandVO) {
        return brandDao.selectByCondition(brandVO);
    }

    @Override
    public List<BrandVO> selectByConditionPage(BrandVO brandVO) {
        return brandDao.selectByConditionPage(brandVO);
    }

    @Override
    public Integer selectByConditionCount(BrandVO brandVO) {
        return brandDao.selectByConditionCount(brandVO);
    }
}
