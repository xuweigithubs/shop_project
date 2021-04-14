package manager.goods.vo;
import lombok.Data;
@Data
public class StockVO {
   private Object skuIds[];
   private String skuId;
   private String supId;
   private String seckillStock;
   private String seckillTotal;
   private String stock;
}
