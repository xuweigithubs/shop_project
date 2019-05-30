package com.huawei.service;

import com.huawei.vo.Product;

import java.util.List;

public interface IProductService {
    /**
     * 获取商品列表
     * @param product
     * @return
     */
    List<Product> selectProductByCondition(Product product);
    /**
     * 添加商品
     */
    void  addProduct(Product product);
    /**
     * 修改商品
     */
    void updateProduct(Product product);
    /**
     * 删除商品
     */
    void deleteProduct(Product product);
}
