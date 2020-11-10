package portal.service.impl;

import portal.service.IProductService;
import portal.dao.ProductMapper;
import portal.vo.Product;
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
        List<Product> productList=productMapper.selectByCondition(product);
        return productList;
    }

}
