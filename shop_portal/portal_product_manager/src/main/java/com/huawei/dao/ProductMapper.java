package com.huawei.dao;

import com.huawei.vo.Product;
import com.huawei.vo.ProductCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    /**
     * 根据条件统计数据
     * @param condition
     * @return
     */
    int countByCondition(ProductCondition condition);

    /**
     * 根据条件删除商品
     * @param condition
     * @return
     */
    int deleteByCondition(ProductCondition condition);

    /**
     * 根据主键删除商品
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入商品数据
     * @param record
     * @return
     */
    int insert(Product record);

    /**
     * 根据条件插入商品数据
     * @param record
     * @return
     */
    int insertSelective(Product record);

    /**
     * 根据条件查询商品数据
     * @param condition
     * @return
     */
    List<Product> selectByCondition(ProductCondition condition);

    /**
     * 根据主键查询商品数据
     * @param id
     * @return
     */
    Product selectByPrimaryKey(String id);

    /**
     * 根据条件更新商品数据
     * @param record
     * @param condition
     * @return
     */
    int updateByConditionSelective(@Param("record") Product record,
                                   @Param("condition") ProductCondition condition);

    /**
     * 根据条件更新商品所有属性
     * @param record
     * @param condition
     * @return
     */
    int updateByCondition(@Param("record") Product record,
                          @Param("condition") ProductCondition condition);

    /**
     * 根据主键更新商品数据
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * 根据主键更新商品所有属性
     * @param record
     * @return
     */
    int updateByPrimaryKey(Product record);
}