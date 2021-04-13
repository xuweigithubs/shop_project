package manager.categories.vo;
import lombok.Data;
import java.util.List;
@Data
public class CategoryVO {
    private String id;
    private Object[] ids;
    private String parentId;
    private String name;
    private boolean isParent;
    private Integer sort;
    private List<CategoryVO> children;
}
