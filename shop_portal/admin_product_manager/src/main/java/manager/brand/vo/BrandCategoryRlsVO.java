package manager.brand.vo;

import lombok.Data;

import java.util.List;

@Data
public class BrandCategoryRlsVO {
    private Integer brandId;
    private List<Integer> categoryIdList;
}
