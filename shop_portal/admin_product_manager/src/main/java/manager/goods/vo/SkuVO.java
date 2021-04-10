package manager.goods.vo;
import lombok.Data;

import java.util.Date;

@Data
public class SkuVO {
    private String id;
    private String spuId;
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
