package manager.spec.params.vo;

import lombok.Data;
import manager.common.Pager;

@Data
public class SpecParamVO {
    private String id;
    private String cid;
    private String groupId;
    private String groupName;
    private String name;
    private Boolean numberic;
    private String unit;
    private Boolean generic;
    private Boolean searching;
    private String segments;
    private Pager pager;
    private Integer[] specParamIds;
}
