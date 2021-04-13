package manager.goods.service.impl;
import common.SnowflakeIdWorker;
import manager.brand.dao.BrandDao;
import manager.brand.vo.BrandVO;
import manager.categories.dao.CategoryDao;
import manager.categories.vo.CategoryVO;
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

import java.util.*;
import java.util.stream.Collectors;

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
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private BrandDao brandDao;
    @Override
    public PageView<List<SpuVO>> selectByConditionPage(SpuVO spuVO) {
        PageView<List<SpuVO>> pageVO=new PageView<List<SpuVO>>();
        List<SpuVO> spus=spuDao.selectByConditionPage(spuVO);
        //组装分类数据
        List<String> categoryIds= spus.stream().map(SpuVO::getCid3).distinct().collect(Collectors.toList());
        List<String> brandIds=spus.stream().map(SpuVO::getBrandId).distinct().collect(Collectors.toList());
        //查询分类和品牌
        CategoryVO spuVOCondition=new CategoryVO();
        Object[] ids=  categoryIds.toArray();
        Object[] brands=  brandIds.toArray();
        spuVOCondition.setIds(ids);
        List<CategoryVO> categories=categoryDao.selectByCondition(spuVOCondition);
        BrandVO brandVO=new BrandVO();
        brandVO.setIds(brands);
        List<BrandVO> brandResults=brandDao.selectByIds(brandVO);
        //将结果转成map
        //获取品牌信息
        int count=spuDao.selectByConditionCount(spuVO);
        Map categoryMap=new HashMap();
        Map brandMap=new HashMap();
        categories.forEach(item->{
            categoryMap.put(item.getId(),item.getName());
        });
        brandResults.forEach(item->{
            brandMap.put(item.getId(),item.getName());
        });
        spus.forEach(item->{
             if(null!=categoryMap.get(item.getCid3())){
                 item.setCategoryName(categoryMap.get(item.getCid3()).toString());
             }
             if(null!=brandMap.get(item.getBrandId())){
                 item.setBrandName(brandMap.get(item.getBrandId()).toString());
             }
        });
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
