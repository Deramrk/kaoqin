package com.shicongyuan.signin.overtimeRule.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.overtimeRule.model.OvertimeRule;
import com.shicongyuan.signin.overtimeRule.service.IOvertimeRuleService;
import com.shicongyuan.signin.util.InterfaceDataVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/overtimeRule")
public class OvertimeRuleController {

    @Autowired
    private IOvertimeRuleService IOvertimeRuleService;

    @ApiOperation(value = "新增加班规则实体",notes = "新增加班规则实体")
    @ApiImplicitParam(name = "OvertimeRule",value = "加班规则实体",required = true)
    @ResponseBody
    @RequestMapping("/insertOvertimeRule")
    public InterfaceDataVo insertOvertimeRule(@RequestBody OvertimeRule overtimeRule){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IOvertimeRuleService.insert(overtimeRule);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据oid删除加班规则实体",notes = "根据oid删除加班规则实体")
    @ApiImplicitParam(name = "oid",value = "主键oid",required = true)
    @ResponseBody
    @GetMapping("/deleteOvertimeRuleBytId/{oid}")
    public InterfaceDataVo deleteOvertimeRuleBytId(@PathVariable("oid") int oid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IOvertimeRuleService.deleteById(oid);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据oid查询加班规则实体",notes = "根据oid查询加班规则实体")
    @ApiImplicitParam(name = "oid",value = "主键oid",required = true)
    @ResponseBody
    @GetMapping("/selectOvertimeRuleBytId/{oid}")
    public InterfaceDataVo selectOvertimeRuleBytId(@PathVariable("oid")int oid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            OvertimeRule OvertimeRule = IOvertimeRuleService.selectById(oid);
            retVo.setData(OvertimeRule);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有加班规则实体分页",notes = "查询所有加班规则实体分页")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectOvertimeRulePageList")
    public InterfaceDataVo selectOvertimeRulePageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<OvertimeRule> page = IOvertimeRuleService.selectPage(new Page<OvertimeRule>());
            retVo.setData(page);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有加班规则实体",notes = "查询所有加班规则实体")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectOvertimeRuleList")
    public InterfaceDataVo selectOvertimeRuleList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<OvertimeRule> list = IOvertimeRuleService.selectList(null);
            retVo.setData(list);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "修改加班规则实体",notes = "修改加班规则实体")
    @ApiImplicitParam(name = "OvertimeRule",value = "加班规则实体",required = true)
    @ResponseBody
    @RequestMapping("/updateOvertimeRule")
    public InterfaceDataVo updateOvertimeRule(@RequestBody OvertimeRule overtimeRule){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IOvertimeRuleService.updateById(overtimeRule);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }
}
