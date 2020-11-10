package portal.dao;

import portal.vo.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> selectByCondition(Product condition);
}