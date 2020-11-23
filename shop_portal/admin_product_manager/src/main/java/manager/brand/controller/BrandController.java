package manager.brand.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.brand.service.BrandService;
import manager.brand.vo.BrandVO;
import manager.common.PageView;
import manager.spec.group.vo.SpecGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/manager"})
@Api(value = "品牌管理模块")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @RequestMapping(value = "/brand/page/list", method = RequestMethod.POST)
    @ApiOperation(notes = "根据名称分页获取参数组信息", value = "get param group info")
    public PageView<List<BrandVO>> selectByConditionPage(@RequestBody BrandVO brandVO){
        PageView<List<BrandVO>> pageVO=new PageView<List<BrandVO>>();
        pageVO.setRows(brandService.selectByConditionPage(brandVO));
        pageVO.setTotal(brandService.selectByConditionCount(brandVO));
        return pageVO;
    }
}
