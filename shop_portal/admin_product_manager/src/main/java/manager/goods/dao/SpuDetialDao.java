package manager.goods.dao;

import manager.goods.vo.SpuDetialVO;
import manager.spec.params.vo.SpecParamVO;

import java.util.List;

public interface SpuDetialDao {
    //根据spuIds查询spu详细信息
    List<SpecParamVO> selectBySupIds(Integer[] spuIds);
    //保存Spu详细信息
    void saveSpuDetial(SpuDetialVO spuDetialVO);
    //删除Spu详细信息
    List<SpuDetialVO> deleteySupIds(Integer[] spuIds);
    //修改Spu详细信息
    void updateSpuDetial(SpuDetialVO spuDetialVO);

}
