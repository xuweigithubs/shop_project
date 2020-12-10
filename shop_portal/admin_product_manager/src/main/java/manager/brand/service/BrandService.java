package manager.brand.service;

import manager.brand.vo.BrandCategoryRlsVO;
import manager.brand.vo.BrandVO;

import java.util.List;

public interface BrandService {
    List<BrandVO> selectByCondition(BrandVO brandVO);

    List<BrandVO> selectByConditionPage(BrandVO brandVO);

    Integer selectByConditionCount(BrandVO brandVO);

    void addBrand(BrandVO brandVO);
    //删除品牌
    void deleteBrand(Integer[] ids);
    //修改平拍
    void updateBrand(BrandVO brandVO);
   //获取品牌对应的产品
    List<Integer> getCategoryIdByBrandId(BrandCategoryRlsVO brandCategoryRlsVO);
    //保存品牌和分类
    void batchSaveBrandAndCategoryRls(BrandCategoryRlsVO brandCategoryRlsVO);
}
