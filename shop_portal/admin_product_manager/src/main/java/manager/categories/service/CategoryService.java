package manager.categories.service;
import manager.categories.vo.CategoryVO;
import java.util.List;

public interface CategoryService {
    //获取商品分类信息
    public List<CategoryVO> selectByCondition(CategoryVO categoryVO);
    //添加商品分类信息
    public void  addCategory(CategoryVO categoryVO);
    //根据ID修改商品分类
    public void updateCategory(CategoryVO categoryVO);
    //删除商品分类
    public void deleteCategories(Integer[] ids);
}
