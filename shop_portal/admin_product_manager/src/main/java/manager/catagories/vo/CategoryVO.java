package manager.catagories.vo;
import lombok.Data;
@Data
public class CategoryVO {
    private String id;
    private String parentId;
    private String name;
    private boolean isParent;
    private Integer sort;
}
