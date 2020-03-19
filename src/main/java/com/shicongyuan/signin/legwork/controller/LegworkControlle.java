package com.shicongyuan.signin.legwork.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.legwork.model.Legwork;
import com.shicongyuan.signin.legwork.service.ILegworkService;
import com.shicongyuan.signin.util.InterfaceDataVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/legwork")
public class LegworkControlle {

    @Autowired
    private ILegworkService ILegworkService;

    @ApiOperation(value = "新增外勤设置实体",notes = "新增排外勤设置实体")
    @ApiImplicitParam(name = "Legwork",value = "外勤设置实体",required = true)
    @ResponseBody
    @RequestMapping("/insertLegwork")
    public InterfaceDataVo insertLegwork(@RequestBody Legwork legwork){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            ILegworkService.insert(legwork);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据lid删除外勤设置实体",notes = "根据lid删除外勤设置实体")
    @ApiImplicitParam(name = "lid",value = "主键lid",required = true)
    @ResponseBody
    @GetMapping("/deleteLegworkBytId/{lid}")
    public InterfaceDataVo deleteLegworkBytId(@PathVariable("lid") int lid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            ILegworkService.deleteById(lid);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据lid查询外勤设置实体",notes = "根据lid查询外勤设置实体")
    @ApiImplicitParam(name = "lid",value = "主键lid",required = true)
    @ResponseBody
    @GetMapping("/selectLegworkBytId/{lid}")
    public InterfaceDataVo selectLegworkBytId(@PathVariable("lid")int lid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Legwork legwork = ILegworkService.selectById(lid);
            retVo.setData(legwork);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有外勤设置实体分页",notes = "查询所有外勤设置实体分页")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectLegworkPageList")
    public InterfaceDataVo selectLegworkPageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<Legwork> page = ILegworkService.selectPage(new Page<Legwork>());
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

    @ApiOperation(value = "查询所有外勤设置实体",notes = "查询所有外勤设置实体")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectLegworkList")
    public InterfaceDataVo selectLegworkList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<Legwork> list = ILegworkService.selectList(null);
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

    @ApiOperation(value = "修改外勤设置实体",notes = "修改外勤设置实体")
    @ApiImplicitParam(name = "Legwork",value = "外勤设置实体",required = true)
    @ResponseBody
    @RequestMapping("/updateLegwork")
    public InterfaceDataVo updateLegwork(@RequestBody Legwork legwork){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            ILegworkService.updateById(legwork);
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
