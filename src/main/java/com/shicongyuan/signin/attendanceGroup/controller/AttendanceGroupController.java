package com.shicongyuan.signin.attendanceGroup.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.attendanceGroup.model.AttendanceGroup;
import com.shicongyuan.signin.attendanceGroup.service.IAttendanceGroupService;
import com.shicongyuan.signin.util.InterfaceDataVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendanceGroup")
public class AttendanceGroupController {

    @Autowired
    private IAttendanceGroupService IAttendanceGroupService;

    @ApiOperation(value = "新增考勤组",notes = "新增考勤组实体")
    @ApiImplicitParam(name = "AttendanceGroup",value = "考勤组实体",required = true)
    @ResponseBody
    @RequestMapping("/insertAttendanceGroupfo")
    public InterfaceDataVo insertAttendanceGroupfo(@RequestBody AttendanceGroup attendanceGroup){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IAttendanceGroupService.insert(attendanceGroup);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据tId删除考勤组实体",notes = "根据tId删除考勤组实体")
    @ApiImplicitParam(name = "tId",value = "主键tId",required = true)
    @ResponseBody
    @GetMapping("/deleteAttendanceGroupBytId/{tId}")
    public InterfaceDataVo deleteAttendanceGroupBytId(@PathVariable("tId") int tId){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IAttendanceGroupService.deleteById(tId);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "根据ID查询考勤组实体",notes = "根据ID查询考勤组实体")
    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectAttendanceGroupBytId/{tId}")
    public InterfaceDataVo selectAttendanceGroupBytId(@PathVariable("tId")int tId){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            AttendanceGroup attendanceGroup = IAttendanceGroupService.selectById(tId);
            retVo.setData(attendanceGroup);
            retVo.setStatus("0");
            retVo.setMessage("成功");
        } catch (Exception e){
            retVo.setStatus("1");
            retVo.setMessage(e.getMessage().toString());
            e.printStackTrace();
        }
        return retVo;
    }

    @ApiOperation(value = "查询所有考勤组实体分页",notes = "查询所有考勤组实体分页")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectAttendanceGroupPageList")
    public InterfaceDataVo selectAttendanceGroupPageList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            Page<AttendanceGroup> page = IAttendanceGroupService.selectPage(new Page<AttendanceGroup>());
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

    @ApiOperation(value = "查询所有考勤组实体",notes = "查询所有考勤组实体")
//    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectAttendanceGroupList")
    public InterfaceDataVo selectAttendanceGroupList(){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            List<AttendanceGroup> list = IAttendanceGroupService.selectList(null);
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

    @ApiOperation(value = "修改考勤组实体",notes = "修改考勤组实体")
    @ApiImplicitParam(name = "AttendanceGroup",value = "考勤组实体",required = true)
    @ResponseBody
    @RequestMapping("/updateAttendanceGroup")
    public InterfaceDataVo updateAttendanceGroup(@RequestBody AttendanceGroup attendanceGroup){
        InterfaceDataVo retVo =new InterfaceDataVo();
        try {
            IAttendanceGroupService.updateById(attendanceGroup);
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
