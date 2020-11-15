package manager.catagories.service;

import manager.catagories.vo.CategoryVO;
import manager.common.PageView;
import manager.spec.group.vo.SpecGroupVO;

import java.util.List;

public interface CategoryService {
    //获取商品分类信息
    public PageView<List<CategoryVO>> selectByCondition(CategoryVO categoryVO);
    //添加商品分类信息
    public void  addCategory(CategoryVO categoryVO);
    //根据ID修改商品分类
    public void updateCategory(CategoryVO categoryVO);
    //删除商品分类
    public void deleteCategories(Integer[] ids);
}
