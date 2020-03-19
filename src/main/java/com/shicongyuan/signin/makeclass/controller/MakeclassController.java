package com.shicongyuan.signin.makeclass.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.makeclass.model.Makeclass;
import com.shicongyuan.signin.makeclass.service.IMakeclassService;
import com.shicongyuan.signin.util.InterfaceDataVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Makeclass")
public class MakeclassController {

    @Autowired
    private IMakeclassService IMakeclassService;


    @ApiOperation(value = "新增排班实体",notes = "新增排班组实体")
    @ApiImplicitParam(name = "Makeclass",value = "排班组实体",required = true)
    @ResponseBody
    @RequestMapping("/insertMakeclass")
    public InterfaceDataVo insertMakeclass(@RequestBody Makeclass makeclass){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IMakeclassService.insert(makeclass);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据cid删除排班实体",notes = "根据tId删除排班实体")
    @ApiImplicitParam(name = "cid",value = "主键cid",required = true)
    @ResponseBody
    @GetMapping("/deleteMakeclassBytId/{cid}")
    public InterfaceDataVo deleteMakeclassBytId(@PathVariable("cid") int cid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IMakeclassService.deleteById(cid);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据cid查询排班实体",notes = "根据ID查询排班实体")
    @ApiImplicitParam(name = "cid",value = "主键cid",required = true)
    @ResponseBody
    @GetMapping("/selectMakeclassBytId/{cid}")
    public InterfaceDataVo selectMakeclassBytId(@PathVariable("cid")int cid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Makeclass makeclass = IMakeclassService.selectById(cid);
            retVo.setData(makeclass);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有排班实体分页",notes = "查询所有排班实体分页")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectMakeclassPageList")
    public InterfaceDataVo selectMakeclassPageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<Makeclass> page = IMakeclassService.selectPage(new Page<Makeclass>());
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

    @ApiOperation(value = "查询所有排班实体",notes = "查询所有排班实体")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectMakeclassList")
    public InterfaceDataVo selectMakeclassList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<Makeclass> list = IMakeclassService.selectList(null);
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

    @ApiOperation(value = "修改排班实体",notes = "修改排班实体")
    @ApiImplicitParam(name = "Classes",value = "排班实体",required = true)
    @ResponseBody
    @RequestMapping("/updateMakeclass")
    public InterfaceDataVo updateMakeclass(@RequestBody Makeclass makeclass){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IMakeclassService.updateById(makeclass);
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
