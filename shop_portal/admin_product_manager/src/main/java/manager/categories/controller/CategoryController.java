package manager.categories.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.categories.service.CategoryService;
import manager.categories.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/manager"})
@Api(value = "商品分类模块")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/category/list", method = RequestMethod.POST)
    @ApiOperation(notes = "查询商品分类信息", value = "get categories info")
    public List<CategoryVO> selectByCondition(@RequestBody CategoryVO categoryVO){
        return categoryService.selectByCondition(categoryVO);
    }
    @RequestMapping(value = "/category/add", method = RequestMethod.POST)
    @ApiOperation(notes = "查询商品分类信息", value = "get categories info")
    public void addCategory(@RequestBody CategoryVO categoryVO){
        categoryService.addCategory(categoryVO);
    }
    @RequestMapping(value = "/category/update", method = RequestMethod.POST)
    @ApiOperation(notes = "查询商品分类信息", value = "get categories info")
    public void updateCategory(@RequestBody CategoryVO categoryVO){
       categoryService.updateCategory(categoryVO);
    }
    @RequestMapping(value = "/category/delete", method = RequestMethod.POST)
    @ApiOperation(notes = "查询商品分类信息", value = "get categories info")
    public void deleteCategory(@RequestBody Integer[] ids){
        categoryService.deleteCategories(ids);
    }

}
