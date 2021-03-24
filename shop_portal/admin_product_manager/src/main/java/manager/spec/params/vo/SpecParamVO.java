package manager.spec.params.vo;

import lombok.Data;
import manager.common.Pager;

@Data
public class SpecParamVO {
    private String id;
    private String cid;
    private String groupId;
    private String name;
    private String numberic;
    private String unit;
    private String generic;
    private String searching;
    private String segments;
    private Pager pager;
}
