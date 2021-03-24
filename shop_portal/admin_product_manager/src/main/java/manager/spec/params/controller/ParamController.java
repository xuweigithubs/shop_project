package manager.spec.params.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.common.PageView;
import manager.spec.params.service.ParamService;
import manager.spec.params.vo.SpecParamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/manager"})
@Api(value = "商品模块")
public class ParamController {
    @Autowired
    private ParamService paramService;
    //分页查询参数组
    @RequestMapping(value = "/spec/params/page/list", method = RequestMethod.POST)
    @ApiOperation(notes = "根据名称分页获取参数组信息", value = "get param group info")
    public PageView<List<SpecParamVO>> selectByConditionPage(@RequestBody SpecParamVO specParamVO){
        return paramService.selectByConditionPage(specParamVO);
    }
    //保存数据
    @RequestMapping(value = "/spec/params/save", method = RequestMethod.POST)
    @ApiOperation(notes = "保存规格参数信息", value = "save params info")
    public void saveParams(@RequestBody SpecParamVO specParamVO){
        paramService.saveParam(specParamVO);
    }
    //删除规格参数
    @RequestMapping(value = "/spec/params/delete", method = RequestMethod.POST)
    @ApiOperation(notes = "删除规格参数", value = "delete params info")
    public void delete(@RequestBody Integer[] ids){
        paramService.deleteParam(ids);
    }

}
