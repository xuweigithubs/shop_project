package portal.controller;
import portal.service.IProductService;
import portal.vo.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = {"/product"})
@Api(value = "商品模块")
public class ProductController {
    @Autowired
    private IProductService productService;
    /**
     * 获取商品列表
     * @param product
     * @return
     */
    @RequestMapping(value = "/selectProductByCondition", method = RequestMethod.GET)
    @ApiOperation(notes = "获取商品信息", value = "get product info")
    public List selectProductByCondition(Product product){
        List list =  productService.selectProductByCondition(product);
        return list;
    }
}
