package manager.brand.vo;

import lombok.Data;
import manager.common.Pager;

import java.util.List;

@Data
public class BrandVO {
  private String id;
  private Object[] ids;
  private String name;
  private String image;
  private String letter;
  private String cid;
  private Pager pager;
}
