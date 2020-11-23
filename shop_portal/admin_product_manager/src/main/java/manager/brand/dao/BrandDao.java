package manager.brand.dao;
import manager.brand.vo.BrandVO;
import java.util.List;
public interface BrandDao {
    List<BrandVO> selectByCondition(BrandVO brandVO);

    List<BrandVO> selectByConditionPage(BrandVO brandVO);

    Integer selectByConditionCount(BrandVO brandVO);
}
