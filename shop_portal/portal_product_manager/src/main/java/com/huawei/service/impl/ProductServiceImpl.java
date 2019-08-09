package com.huawei.service.impl;

import com.huawei.dao.ProductMapper;
import com.huawei.service.IProductService;
import com.huawei.utils.IdGenerator;
import com.huawei.vo.Product;
import com.huawei.vo.ProductCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "productService")
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    /**
     * 通过条件查询商品
     * @param product
     * @return
     */
    @Override
    public List<Product> selectProductByCondition(Product product) {
        ProductCondition condition=new ProductCondition();
        //根据商品名称查询商品
        if(null!=product.getProductname()){
            condition.createCriteria().andProductnameLike(product.getProductname());
        }
        //根据商品ID查询商品
        if(null!=product.getId()){
            condition.createCriteria().andIdEqualTo(product.getId());
        }
        List<Product> productList=productMapper.selectByCondition(condition);

        return productList;
    }

    /**
     * 添加商品
     * @param product
     */
    @Override
    public void addProduct(Product product) {
        product.setId(IdGenerator.INSTANCE.nextId());
        productMapper.insertSelective(product);
    }

    /**
     * 修改商品
     * @param product
     */
    @Override
    public void updateProduct(Product product) {
        productMapper.updateByPrimaryKeySelective(product);
    }

    /**
     * 删除商品
     * @param product
     */
    @Override
    public void deleteProduct(Product product) {
        productMapper.deleteByPrimaryKey(product.getId());
    }
}
