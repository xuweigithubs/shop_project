package manager.categories.service.impl;
import manager.categories.dao.CategoryDao;
import manager.categories.service.CategoryService;
import manager.categories.vo.CategoryEnum;
import manager.categories.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<CategoryVO> selectByCondition(CategoryVO categoryVO) {
        List<CategoryVO> allCatagories=categoryDao.selectByCondition(categoryVO);
        //找到
        List<CategoryVO> fatherCategories = allCatagories.stream().filter(
                category -> CategoryEnum.LEVEL_ONE.getValue().equals(category.getParentId())
        ).collect(Collectors.toList());
        List<CategoryVO> categories=new ArrayList<CategoryVO>();
        fatherCategories.forEach(item->{
            this.addChildrenNodeToList(categories,allCatagories,item);
        });
        return fatherCategories;
    }
    private void addChildrenNodeToList(List<CategoryVO> categories,List<CategoryVO> allCategories,CategoryVO currentNode){
        //获取以当前节点为父亲的所有节点
        List<CategoryVO> childrenNodes=allCategories.stream().filter(item->item.getParentId().equals(currentNode.getId())).collect(Collectors.toList());
        if(childrenNodes.size()>0){
            currentNode.setChildren(childrenNodes);
            childrenNodes.forEach(childItem->{
                addChildrenNodeToList(categories,allCategories,childItem);
            });
        }
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
