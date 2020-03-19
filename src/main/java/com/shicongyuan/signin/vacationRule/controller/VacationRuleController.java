package com.shicongyuan.signin.vacationRule.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.backPay.model.BackPay;
import com.shicongyuan.signin.util.InterfaceDataVo;
import com.shicongyuan.signin.vacationRule.model.VacationRule;
import com.shicongyuan.signin.vacationRule.service.IVacationRuleService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacationRule")
public class VacationRuleController {

    @Autowired
    private IVacationRuleService IVacationRuleService;

    @ApiOperation(value = "新增补卡规则实体",notes = "新增补卡规则实体")
    @ApiImplicitParam(name = "VacationRule",value = "补卡规则实体",required = true)
    @ResponseBody
    @RequestMapping("/insertVacationRule")
    public InterfaceDataVo insertVacationRule(@RequestBody VacationRule vacationRule){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IVacationRuleService.insert(vacationRule);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据vid删除补卡规则实体",notes = "根据vid删除补卡规则实体")
    @ApiImplicitParam(name = "vid",value = "主键vid",required = true)
    @ResponseBody
    @GetMapping("/deleteVacationRuleBytId/{vid}")
    public InterfaceDataVo deleteVacationRuleBytId(@PathVariable("vid") int vid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IVacationRuleService.deleteById(vid);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据vid查询补卡规则实体",notes = "根据vid查询补卡规则实体")
    @ApiImplicitParam(name = "vid",value = "主键vid",required = true)
    @ResponseBody
    @GetMapping("/selectVacationRuleBytId/{vid}")
    public InterfaceDataVo selectVacationRuleBytId(@PathVariable("vid")int vid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            VacationRule vacationRule = IVacationRuleService.selectById(vid);
            retVo.setData(vacationRule);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有补卡规则实体分页",notes = "查询所有补卡规则实体分页")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectVacationRulePageList")
    public InterfaceDataVo selectVacationRulePageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<VacationRule> page = IVacationRuleService.selectPage(new Page<VacationRule>());
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

    @ApiOperation(value = "查询所有补卡规则实体",notes = "查询所有补卡规则实体")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectVacationRuleList")
    public InterfaceDataVo selectVacationRuleList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<VacationRule> list = IVacationRuleService.selectList(null);
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

    @ApiOperation(value = "修改补卡规则实体",notes = "修改补卡规则实体")
    @ApiImplicitParam(name = "VacationRule",value = "补卡规则实体",required = true)
    @ResponseBody
    @RequestMapping("/updateVacationRule")
    public InterfaceDataVo updateVacationRule(@RequestBody VacationRule vacationRule){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IVacationRuleService.updateById(vacationRule);
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
