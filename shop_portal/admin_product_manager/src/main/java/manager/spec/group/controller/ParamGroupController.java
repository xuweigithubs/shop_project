package manager.spec.group.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import manager.common.PageView;
import manager.spec.group.service.ParamGroupService;
import manager.spec.group.vo.SpecGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    //分页查询参数组
    @RequestMapping(value = "/spec/group/page/list", method = RequestMethod.POST)
    @ApiOperation(notes = "根据名称分页获取参数组信息", value = "get param group info")
    public PageView<List<SpecGroupVO>> selectByConditionPage(@RequestBody SpecGroupVO specGroupVO){
        return paramGroupService.selectByConditionPage(specGroupVO);
    }
    //不分页查询参数组
    @RequestMapping(value = "/spec/group/list", method = RequestMethod.POST)
    @ApiOperation(notes = "根据名称分页获取参数组信息", value = "get param group info")
    public List<SpecGroupVO> selectByCondition(@RequestBody SpecGroupVO specGroupVO){
        return paramGroupService.selectByCondition(specGroupVO);
    }
    //添加参数分组
    @RequestMapping(value = "/spec/group/add", method = RequestMethod.POST)
    @ApiOperation(notes = "添加参数组信息", value = "add param group info")
    public void add(@RequestBody SpecGroupVO specGroupVO){
        paramGroupService.addSpecGroup(specGroupVO);
    }
    //修改参数组
    @RequestMapping(value = "/spec/group/update", method = RequestMethod.POST)
    @ApiOperation(notes = "修改参数组信息", value = "update param group info")
    public void update(@RequestBody SpecGroupVO specGroupVO){
        paramGroupService.updateSpecGroup(specGroupVO);
    }
    //删除参数组
    @RequestMapping(value = "/spec/group/delete", method = RequestMethod.POST)
    @ApiOperation(notes = "修改参数组信息", value = "delete param group info")
    public void delete(@RequestBody Integer[] ids){
        paramGroupService.deleteSpecGroup(ids);
    }
    //批量保存参数组
    @RequestMapping(value = "/spec/group/addBatch", method = RequestMethod.POST)
    @ApiOperation(notes = "修改参数组信息", value = "delete param group info")
    public void addBatch(@RequestBody List<SpecGroupVO> paramGroupList){
        paramGroupService.addBatch(paramGroupList);
    }
}
