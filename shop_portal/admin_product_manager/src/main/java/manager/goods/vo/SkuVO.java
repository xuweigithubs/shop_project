package manager.goods.vo;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SkuVO {
    private String id;
    private String spuId;
    private List<String> spuIds;
    private String title;
    private String images;
    private String price;
    private String indexes;
    private String ownSpec;
    private Boolean enable;
    private Date createTime;
    private Date lastUpdateTime;
    private StockVO stockVO;
}
