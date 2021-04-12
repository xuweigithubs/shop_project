package manager.goods.service.impl;
import common.SnowflakeIdWorker;
import manager.common.PageView;
import manager.goods.dao.SkuDao;
import manager.goods.dao.SpuDao;
import manager.goods.dao.SpuDetialDao;
import manager.goods.dao.StockDao;
import manager.goods.service.GoodsService;
import manager.goods.vo.SkuVO;
import manager.goods.vo.SpuDetialVO;
import manager.goods.vo.SpuVO;
import manager.goods.vo.StockVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private SkuDao skuDao;
    @Autowired
    private SpuDao spuDao;
    @Autowired
    private SpuDetialDao spuDetialDao;
    @Autowired
    private StockDao stockDao;
    @Override
    public PageView<List<SpuVO>> selectByConditionPage(SpuVO spuVO) {
        PageView<List<SpuVO>> pageVO=new PageView<List<SpuVO>>();
        List<SpuVO> spus=spuDao.selectByConditionPage(spuVO);
        int count=spuDao.selectByConditionCount(spuVO);
        pageVO.setRows(spus);
        pageVO.setTotal(count);
        return pageVO;
    }

    @Override
    public List<SpuVO> selectByCondition(SpuVO spuVO) {

        return null;
    }
    @Transactional
    @Override
    public void addGood(SpuVO spuVO) {
        //保存spu信息
         SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
         Long spuId=idWorker.nextId();
         String spuStrId=spuId.toString();
         spuVO.setId(spuStrId);
         spuVO.setCreateTime(new Date());
         spuVO.setLastUpdateTime(new Date());
         spuDao.saveSpu(spuVO);
         SpuDetialVO spuDetialVO=spuVO.getSpuDetialVO();
         spuDetialVO.setSpuId(spuStrId);
         spuDetialDao.saveSpuDetial(spuVO.getSpuDetialVO());
        //保存sku信息
        List<SkuVO> skus=spuVO.getSkus();
        List<StockVO> stocks=new ArrayList<StockVO>();
        skus.forEach(item->{
             item.setCreateTime(new Date());
             item.setLastUpdateTime(new Date());
             String skuId=String.valueOf(idWorker.nextId());
             item.setId(skuId);
             item.setSpuId(spuStrId);
             StockVO stockVO=item.getStockVO();
             stockVO.setSkuId(skuId);
             stockVO.setSeckillStock("0");
             stockVO.setSeckillTotal("0");
             stocks.add(stockVO);
        });
         skuDao.saveSkus(skus);
         stockDao.saveStocks(stocks);
    }

    @Override
    public void updateGood(SpuVO spuVO) {

    }

    @Override
    public void deleteGoods(Integer[] ids) {

    }

}
