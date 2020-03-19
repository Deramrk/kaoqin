package com.shicongyuan.signin.attendanceinfo.controller;



import com.shicongyuan.signin.attendanceinfo.model.AttendanceInfo;
import com.shicongyuan.signin.attendanceinfo.service.IAttendanceInfoService;
import com.shicongyuan.signin.orginfo.model.OrgInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LXG
 * @since 2020-03-19
 */
@Controller
@RequestMapping("/attendanceInfo")
public class AttendanceInfoController {

    @Autowired
    private IAttendanceInfoService IAttendanceInfoService;

    @ApiOperation(value = "添加考勤信息实体", notes = "添加考勤信息实体")
    @ApiImplicitParam(name = "AttendanceInfo", value = "考勤信息", required = true)
    @ResponseBody
    @RequestMapping("/addatteninfo")
    public void addatteninfo(@RequestBody AttendanceInfo AttendanceInfo) {

        IAttendanceInfoService.insert(AttendanceInfo);
    }

    @ApiOperation(value = "根据用户id删除考勤信息实体", notes = "根据用户id删除考勤信息实体")
    @ApiImplicitParam(name = "uid", value = "用户id", required = true)
    @ResponseBody
    @RequestMapping("/delatteninfo/{uid}")
    public void delatteninfo(@PathVariable("oid") String uid) {
        IAttendanceInfoService.deleteById(uid);

    }

    @ApiOperation(value = "根据用户id修改考勤信息", notes = "根据用户id修改考勤信息")
    @ApiImplicitParam(name = "AttendanceInfo", value = "考勤信息", required = true)
    @ResponseBody
    @RequestMapping("/updtatteninfo")
    public void updateOrgInfo(@RequestBody AttendanceInfo AttendanceInfo) {
        IAttendanceInfoService.updateById(AttendanceInfo);

    }

    @ApiOperation(value = "用户的考勤数据", notes = "用户的考勤数据")
    @ApiImplicitParam(name = "uid", value = "用户的id", required = true)
    @RequestMapping(value = "/queryUserAtendandceInfo/{uid}")
    @ResponseBody
    public Map<String,Object> queryUserAtendandceInfo(@PathVariable("uid") String uid){
        Map<String,Object> map=new HashMap<>();
        try{
            Map<String,List> modules = IAttendanceInfoService.queryUserAtendandceInfo(uid);
            map.put("data",modules);
            map.put("flag",true);
        }catch (Exception e){
            map.put("msg","系统异常");
            map.put("flag",false);
        }
        return map;
    }

}

