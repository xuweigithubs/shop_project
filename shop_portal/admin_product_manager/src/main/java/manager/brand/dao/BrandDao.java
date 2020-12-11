package manager.brand.dao;
import manager.brand.vo.BrandCategoryRlsVO;
import manager.brand.vo.BrandVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface BrandDao {
    List<BrandVO> selectByCondition(BrandVO brandVO);

    List<BrandVO> selectByConditionPage(BrandVO brandVO);

    Integer selectByConditionCount(BrandVO brandVO);
    //添加品牌信息
    void addBrand(BrandVO brandVO);
    //修改品牌
    void updateBrand(BrandVO brandVO);
    //删除品牌
    void deleteBrand(Integer[] ids);
    //根据品牌获取分类编码
    List<BrandCategoryRlsVO> selectCategoryBybrandId(BrandCategoryRlsVO brandCategoryRlsVO);
    //保存分类编码
    void batchSaveBrandAndCategoryRls(@Param("brandCategoryRlsVOList") List<BrandCategoryRlsVO> brandCategoryRlsVOList);
    void deleteRlsByBrandId(@Param("brandCategoryRlsVO") BrandCategoryRlsVO brandCategoryRlsVO);
}
