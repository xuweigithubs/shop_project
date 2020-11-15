package manager.catagories.dao;
import manager.catagories.vo.CategoryVO;
import java.util.List;
public interface CategoryDao {
    //根据名称搜索参数组
    List<CategoryVO> selectByCondition(CategoryVO categoryVO);
    //添加分组
    void addCategory(CategoryVO categoryVO);
    //修改分组
    void updateCategory(CategoryVO categoryVO);
    //删除参数组
    void deleteCategories(Integer[] ids);
}
