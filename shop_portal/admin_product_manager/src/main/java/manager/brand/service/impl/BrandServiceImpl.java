package manager.brand.service.impl;

import manager.brand.dao.BrandDao;
import manager.brand.service.BrandService;
import manager.brand.vo.BrandCategoryRlsVO;
import manager.brand.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    //添加品牌
    public  void addBrand(BrandVO brandVO){
        brandDao.addBrand(brandVO);
    }
    //删除品牌
    public  void deleteBrand(Integer[] ids){
        brandDao.deleteBrand(ids);
    }
    //修改品牌
    public void updateBrand(BrandVO brandVO){
        brandDao.updateBrand(brandVO);
    }

    @Override
    public List<Integer> getCategoryIdByBrandId(BrandCategoryRlsVO brandCategoryRlsVO) {
        List<BrandCategoryRlsVO> list=brandDao.selectCategoryBybrandId(brandCategoryRlsVO);
        List<Integer> categoryIdList=new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            categoryIdList.add(list.get(i).getCategoryId());
        }
        return categoryIdList;
    }
    //保存分类数据
    @Override
    public void batchSaveBrandAndCategoryRls(List<BrandCategoryRlsVO> brandCategoryRlsVOList) {
        brandDao.deleteRlsByBrandId(brandCategoryRlsVOList.get(0));
        brandDao.batchSaveBrandAndCategoryRls(brandCategoryRlsVOList);
    }
}
