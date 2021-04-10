package manager.goods.service.impl;

import manager.common.PageView;
import manager.goods.service.GoodsService;
import manager.goods.vo.SpuVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Override
    public PageView<List<SpuVO>> selectByConditionPage(SpuVO spuVO) {
        return null;
    }

    @Override
    public List<SpuVO> selectByCondition(SpuVO spuVO) {
        return null;
    }

    @Override
    public void addGood(SpuVO spuVO) {
        //保存spu信息
        //保存sku信息
        //保存库存信息
    }

    @Override
    public void updateGood(SpuVO spuVO) {

    }

    @Override
    public void deleteGoods(Integer[] ids) {

    }

}
