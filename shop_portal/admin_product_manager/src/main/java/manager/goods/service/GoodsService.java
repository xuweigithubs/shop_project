package manager.goods.service;

import manager.common.PageView;
import manager.goods.vo.SpuVO;
import manager.spec.group.vo.SpecGroupVO;

import java.util.List;

public interface GoodsService{
    //获取规格参数组
    public PageView<List<SpuVO>> selectByConditionPage(SpuVO spuVO);
    //不分页查询
    public SpuVO selectByCondition(SpuVO spuVO);
    //添加规格参数组
    public void  addGood(SpuVO spuVO);
    //根据ID修改参数组
    public void updateGood(SpuVO spuVO);
    //删除参数组
    public void deleteGoods(Integer[] ids);
}
