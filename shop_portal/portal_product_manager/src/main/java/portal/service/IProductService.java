package portal.service;

import portal.vo.Product;

import java.util.List;

public interface IProductService {
    /**
     * 获取商品列表
     * @param product
     * @return
     */
    List<Product> selectProductByCondition(Product product);

}
