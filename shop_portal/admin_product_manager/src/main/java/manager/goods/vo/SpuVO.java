package manager.goods.vo;
import lombok.Data;
import manager.common.Pager;

import java.util.Date;
import java.util.List;

@Data
public class SpuVO {
    private String id;
    private String title;
    private String subTitle;
    private String cid1;
    private String cid2;
    private String cid3;
    private String brandId;
    private Boolean saleable;
    private Boolean valid;
    private Date createTime;
    private Date lastUpdateTime;
    private SpuDetialVO spuDetialVO;
    private List<SkuVO> skus;
    private Pager pager;
}
