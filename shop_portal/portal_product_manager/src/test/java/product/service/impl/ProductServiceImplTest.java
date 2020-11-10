package product.service.impl;

import portal.ProductApplication;
import portal.service.IProductService;
import portal.vo.Product;
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

}