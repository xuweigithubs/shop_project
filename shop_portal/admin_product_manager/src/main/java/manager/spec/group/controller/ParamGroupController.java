package manager.spec.group.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.spec.group.service.ParamGroupService;
import manager.spec.group.vo.SpecGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = {"/manager"})
@Api(value = "商品模块")
public class ParamGroupController {
    @Autowired
    private ParamGroupService paramGroupService;
    @RequestMapping(value = "/spec/group/list", method = RequestMethod.GET)
    @ApiOperation(notes = "获取商品信息", value = "get product info")
    public List<SpecGroupVO> selectByCondition(SpecGroupVO specGroupVO){
        return paramGroupService.selectByCondition(specGroupVO);
    }
}
