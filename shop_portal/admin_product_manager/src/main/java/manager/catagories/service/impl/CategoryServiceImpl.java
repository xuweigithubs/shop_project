package manager.catagories.service.impl;

import manager.catagories.dao.CategoryDao;
import manager.catagories.service.CategoryService;
import manager.catagories.vo.CategoryVO;
import manager.common.PageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public PageView<List<CategoryVO>> selectByCondition(CategoryVO categoryVO) {
        return null;
    }

    @Override
    public void addCategory(CategoryVO categoryVO) {

    }

    @Override
    public void updateCategory(CategoryVO categoryVO) {

    }

    @Override
    public void deleteCategories(Integer[] ids) {

    }
}
