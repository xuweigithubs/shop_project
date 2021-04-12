package manager.goods.dao;
import manager.goods.vo.StockVO;
import java.util.List;
public interface StockDao {
    //根据条件查询库存
    List<StockVO> selectByCondition(StockVO stockVO);
    //批量保存库存信息
    void saveStocks(List<StockVO> stockVOList);
    //根据SpuId删除库存信息
    void deleteStock(StockVO stockVO);
    //更新库存信息
    void updateStock(StockVO stockVO);
}
