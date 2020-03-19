package com.shicongyuan.signin.classes.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.classes.model.Classes;
import com.shicongyuan.signin.classes.service.IClassesService;
import com.shicongyuan.signin.util.InterfaceDataVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Classes")
public class ClassesController {
    @Autowired
    private IClassesService IClassesService;

    @ApiOperation(value = "新增班次",notes = "新增班次实体")
    @ApiImplicitParam(name = "Classes",value = "班次实体",required = true)
    @ResponseBody
    @RequestMapping("/insertClasses")
    public InterfaceDataVo insertClasses(@RequestBody Classes Classes){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IClassesService.insert(Classes);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据cid删除班次实体",notes = "根据cid删除班次实体")
    @ApiImplicitParam(name = "cid",value = "主键cid",required = true)
    @ResponseBody
    @GetMapping("/deleteClassesByCid/{cid}")
    public InterfaceDataVo deleteClassesByCid(@PathVariable("cid") int cid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IClassesService.deleteById(cid);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据cid查询班次实体",notes = "根据cid查询班次实体")
    @ApiImplicitParam(name = "cid",value = "主键cid",required = true)
    @ResponseBody
    @GetMapping("/selectClassesByCid/{cid}")
    public InterfaceDataVo selectClassesByCid(@PathVariable("cid")int cid){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Classes Classes = IClassesService.selectById(cid);
            retVo.setData(Classes);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有班次实体分页",notes = "查询所有班次实体分页")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectClassesPageList")
    public InterfaceDataVo selectClassesPageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<Classes> page = IClassesService.selectPage(new Page<Classes>());
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

    @ApiOperation(value = "查询所有班次实体",notes = "查询所有班次实体")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectClassesList")
    public InterfaceDataVo selectClassesList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<Classes> list = IClassesService.selectList(null);
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

    @ApiOperation(value = "修改班次实体",notes = "修改班次实体")
    @ApiImplicitParam(name = "Classes",value = "班次实体",required = true)
    @ResponseBody
    @RequestMapping("/updateClasses")
    public InterfaceDataVo updateClasses(@RequestBody Classes Classes){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IClassesService.updateById(Classes);
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
