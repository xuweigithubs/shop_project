package manager.goods.vo;
import lombok.Data;
@Data
public class SpuDetialVO {
    private String spuId;
    //描述
    private String description;
    //全部规格参数
    private String specifications;
    //特殊规格参数信息以及可选值
    private String specTemplate;
    //包装清单
    private String packingList;
    //售后服务
    private String afterService;
}
