package manager.goods.dao;

import manager.goods.vo.SpuVO;
import manager.spec.params.vo.SpecParamVO;

import java.util.List;

public interface SpuDao {
    //分页查询Spu信息
    List<SpuVO> selectByConditionPage(SpuVO spuVO);
    //根据条件查询Spu信息
    List<SpuVO> selectByCondition(SpuVO spuVO);
    //根据条件统计Spu信息
    Integer selectByConditionCount(SpuVO spuVO);
    //保存Spu信息
    void saveSpu(SpuVO spuVO);
    //根据id删除spu
    void deleteSpus(Integer[] ids);
    //修改spu信息
    void updateSpu(SpuVO spuVO);

}
