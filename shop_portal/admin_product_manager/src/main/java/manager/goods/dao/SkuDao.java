package manager.goods.dao;

import manager.goods.vo.SkuVO;

import java.util.List;

public interface SkuDao {
    //根据条件搜索Spu
    List<SkuVO> selectByCondition(SkuVO skuVO);
    //根据条件统计规格参数
    Integer selectByConditionCount(SkuVO skuVO);
    //保存参数
    void saveSkus(List<SkuVO> skus);
    //删除Sku信息
    void deleteSkuBySpuId(SkuVO skuVO);
    //删除sku信息
    void deleteSkuBySkuIds(List<String> ids);
}
