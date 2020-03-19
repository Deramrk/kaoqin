package com.shicongyuan.signin.rule.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.rule.model.RuleInfo;
import com.shicongyuan.signin.rule.service.IRuleInfoService;
import com.shicongyuan.signin.util.InterfaceDataVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ruleInfo")
public class RuleInfoController {

    @Autowired
    private IRuleInfoService IRuleInfoService;

    @ApiOperation(value = "新增规则",notes = "新增规则实体")
    @ApiImplicitParam(name = "ruleInfo",value = "规则实体",required = true)
    @ResponseBody
    @RequestMapping("/insertRuleInfo")
    public InterfaceDataVo insertRuleInfo(@RequestBody RuleInfo ruleInfo){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IRuleInfoService.insert(ruleInfo);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据ID删除规则实体",notes = "根据ID删除规则实体")
    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/deleteRuleInfoById/{id}")
    public InterfaceDataVo deleteRuleInfoById(@PathVariable("id") int id){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IRuleInfoService.deleteById(id);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据ID查询规则实体",notes = "根据ID查询规则实体")
    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectRuleInfoById/{id}")
    public InterfaceDataVo selectRuleInfoById(@PathVariable("id")int id){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            RuleInfo ruleInfo = IRuleInfoService.selectById(id);
            retVo.setData(ruleInfo);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有规则实体分页",notes = "查询所有规则实体分页")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectRuleInfoPageList")
    public InterfaceDataVo selectRuleInfoPageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<RuleInfo> page = IRuleInfoService.selectPage(new Page<RuleInfo>());
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

    @ApiOperation(value = "查询所有规则实体",notes = "查询所有规则实体")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectRuleInfoList")
    public InterfaceDataVo selectRuleInfoList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<RuleInfo> list = IRuleInfoService.selectList(null);
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

    @ApiOperation(value = "修改规则实体",notes = "修改规则实体")
    @ApiImplicitParam(name = "ruleInfo",value = "规则实体",required = true)
    @ResponseBody
    @RequestMapping("/updateRuleInfo")
    public InterfaceDataVo updateRuleInfo(@RequestBody RuleInfo ruleInfo){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IRuleInfoService.updateById(ruleInfo);
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
