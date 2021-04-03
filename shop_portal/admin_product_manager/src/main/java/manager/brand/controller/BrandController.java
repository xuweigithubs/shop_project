package manager.brand.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.brand.service.BrandService;
import manager.brand.vo.BrandCategoryRlsVO;
import manager.brand.vo.BrandVO;
import manager.common.PageView;
import manager.spec.group.vo.SpecGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = {"/manager"})
@Api(value = "品牌管理模块")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @RequestMapping(value = "/brand/page/list", method = RequestMethod.POST)
    @ApiOperation(notes = "分页获取品牌信息", value = "query brand")
    public PageView<List<BrandVO>> selectByConditionPage(@RequestBody BrandVO brandVO){
        PageView<List<BrandVO>> pageVO=new PageView<List<BrandVO>>();
        pageVO.setRows(brandService.selectByConditionPage(brandVO));
        pageVO.setTotal(brandService.selectByConditionCount(brandVO));
        return pageVO;
    }
    @RequestMapping(value = "/brand/list", method = RequestMethod.POST)
    @ApiOperation(notes = "分页获取品牌信息", value = "query brand")
    public List<BrandVO> selectByCondition(@RequestBody BrandVO brandVO){
        return brandService.selectByCondition(brandVO);
    }
    //添加品牌
    @RequestMapping(value = "/brand/add", method = RequestMethod.POST)
    @ApiOperation(notes = "分页获取品牌信息", value = "query brand")
    public  void addBrand(@RequestBody BrandVO brandVO){
        brandService.addBrand(brandVO);
    }
    //删除品牌
    @RequestMapping(value = "/brand/delete", method = RequestMethod.POST)
    @ApiOperation(notes = "分页获取品牌信息", value = "query brand")
    public  void deleteBrand(@RequestBody Integer[] ids){
        brandService.deleteBrand(ids);
    }
    //修改品牌
    @RequestMapping(value = "/brand/update", method = RequestMethod.POST)
    @ApiOperation(notes = "修改品牌", value = "updateBrand")
    public void updateBrand(@RequestBody BrandVO brandVO){
        brandService.updateBrand(brandVO);
    }
    //获取数据
    @RequestMapping(value = "/brand/getCategoryIdByBrandId", method = RequestMethod.POST)
    @ApiOperation(notes = "修改品牌", value = "updateBrand")
    public List<Integer> getCategoryIdByBrandId(@RequestBody BrandCategoryRlsVO brandCategoryRlsVO){
       List<Integer> list=brandService.getCategoryIdByBrandId(brandCategoryRlsVO);
       return list;
    }
    //保存品牌与分类的关系
    @RequestMapping(value = "/brand/batchSaveBrandAndCategoryRls", method = RequestMethod.POST)
    @ApiOperation(notes = "修改品牌", value = "updateBrand")
    public void batchSaveBrandAndCategoryRls(@RequestBody List<BrandCategoryRlsVO> brandCategoryRlsVOList){
        brandService.batchSaveBrandAndCategoryRls(brandCategoryRlsVOList);
    }
}
