package com.huawei.controller;

import com.huawei.service.IProductService;
import com.huawei.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/product"})
public class ProductController {
    @Autowired
    private IProductService productService;
    @RequestMapping(value = {"/selectProductByCondition"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public List selectProductByCondition(Product product){
        List list =  productService.selectProductByCondition(product);
        return list;
    }
}
