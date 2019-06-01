package com.huawei.service.impl;

import com.huawei.ProductApplication;
import com.huawei.service.IProductService;
import com.huawei.vo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProductApplication.class)
public class ProductServiceImplTest {
    @Autowired
    private IProductService productService;
    @Test
    public void selectProductByCondition() {
        Product product=new Product();
        product.setProductname("XXX");
        List<Product>  productList=productService.selectProductByCondition(product);
        System.out.println(productList);
    }

    @Test
    public void addProduct() {
        Product product=new Product();
        product.setProductname("XXX");
        product.setBrandid("1");
        product.setPrice("100.4");
        product.setProductbz("这是一个很好的商品");
        product.setProductdesc1("放置在常温下");
        product.setProductdesc2("放置在常温下");
        product.setProductorigin("广东深圳");
        product.setProductshape("铁塔型");
        product.setWeight("100");
        productService.addProduct(product);
    }

    @Test
    public void updateProduct() {
        Product product=new Product();
        product.setId("20190601230610347");
        product.setProductname("修改后的商品");
        product.setBrandid("1");
        product.setPrice("100.4");
        product.setProductbz("这是一个很好的商品");
        product.setProductdesc1("放置在常温下");
        product.setProductdesc2("放置在常温下");
        product.setProductorigin("广东深圳");
        product.setProductshape("铁塔型");
        product.setWeight("100");
        productService.updateProduct(product);
    }

    @Test
    public void deleteProduct() {
        Product product=new Product();
        product.setId("20190601230610347");
        productService.deleteProduct(product);
    }
}