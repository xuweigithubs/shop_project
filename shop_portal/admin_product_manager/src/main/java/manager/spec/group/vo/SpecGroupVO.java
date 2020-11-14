package manager.spec.group.vo;

import lombok.Data;
import manager.common.Pager;

@Data
public class SpecGroupVO {
    private String id;
    private String cid;
    private String name;
    private Pager pager;
}
