package com.shicongyuan.signin.backPay.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.backPay.model.BackPay;
import com.shicongyuan.signin.backPay.service.IBackPayService;
import com.shicongyuan.signin.overtimeRule.model.OvertimeRule;
import com.shicongyuan.signin.util.InterfaceDataVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backPay")
public class BackPayController {

    @Autowired
    private IBackPayService IBackPayService;

    @ApiOperation(value = "新增补卡规则实体",notes = "新增补卡规则实体")
    @ApiImplicitParam(name = "BackPay",value = "补卡规则实体",required = true)
    @ResponseBody
    @RequestMapping("/insertBackPay")
    public InterfaceDataVo insertBackPay(@RequestBody BackPay backPay){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IBackPayService.insert(backPay);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据bid删除补卡规则实体",notes = "根据bid删除补卡规则实体")
    @ApiImplicitParam(name = "bid",value = "主键bid",required = true)
    @ResponseBody
    @GetMapping("/deleteBackPayBytId/{bid}")
    public InterfaceDataVo deleteBackPayBytId(@PathVariable("bid") int bid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IBackPayService.deleteById(bid);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据bid查询补卡规则实体",notes = "根据bid查询补卡规则实体")
    @ApiImplicitParam(name = "bid",value = "主键bid",required = true)
    @ResponseBody
    @GetMapping("/selectBackPayBytId/{bid}")
    public InterfaceDataVo selectBackPayBytId(@PathVariable("bid")int bid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            BackPay backPay = IBackPayService.selectById(bid);
            retVo.setData(backPay);
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
    @GetMapping("/selectBackPayPageList")
    public InterfaceDataVo selectBackPayPageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<BackPay> page = IBackPayService.selectPage(new Page<BackPay>());
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
    @GetMapping("/selectBackPayList")
    public InterfaceDataVo selectBackPayList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<BackPay> list = IBackPayService.selectList(null);
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
    @ApiImplicitParam(name = "BackPay",value = "补卡规则实体",required = true)
    @ResponseBody
    @RequestMapping("/updateBackPay")
    public InterfaceDataVo updateBackPay(@RequestBody BackPay backPay){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IBackPayService.updateById(backPay);
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
