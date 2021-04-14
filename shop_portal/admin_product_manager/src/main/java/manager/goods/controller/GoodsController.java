package manager.goods.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.common.PageView;
import manager.goods.service.GoodsService;
import manager.goods.vo.SpuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/manager"})
@Api(value = "商品模块")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    //分页查询参数组
    @RequestMapping(value = "/goods/page/list", method = RequestMethod.POST)
    @ApiOperation(notes = "分页获取规格参数信息", value = "get goods info")
    public PageView<List<SpuVO>> selectByConditionPage(@RequestBody SpuVO spuVO){
        return goodsService.selectByConditionPage(spuVO);
    }
    @RequestMapping(value = "/goods/save", method = RequestMethod.POST)
    @ApiOperation(notes = "保存Spu信息", value = "save goods info")
    public void save(@RequestBody SpuVO spuVO){
        goodsService.addGood(spuVO);
    }
    @RequestMapping(value = "/goods/delete", method = RequestMethod.POST)
    @ApiOperation(notes = "保存Spu信息", value = "save goods info")
    public void delete(@RequestBody List<String> ids){
        goodsService.deleteGoods(ids);
    }
    @RequestMapping(value = "/goods/update", method = RequestMethod.POST)
    @ApiOperation(notes = "保存Spu信息", value = "save goods info")
    public void update(@RequestBody SpuVO spuVO){
        goodsService.updateGood(spuVO);
    }
    //按条件查询数据
    @RequestMapping(value = "/goods/single", method = RequestMethod.POST)
    @ApiOperation(notes = "分页获取规格参数信息", value = "get goods info")
    public SpuVO selectBySingle(@RequestBody SpuVO spuVO){
        return goodsService.selectByCondition(spuVO);
    }
}
