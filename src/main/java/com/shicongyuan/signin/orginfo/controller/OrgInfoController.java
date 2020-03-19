package com.shicongyuan.signin.orginfo.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.shicongyuan.signin.orginfo.model.OrgInfo;
import com.shicongyuan.signin.orginfo.service.IOrgInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LXG
 * @since 2020-03-19
 */
@Controller
@RequestMapping("/orgInfo")
public class OrgInfoController {
    @Autowired
     private     IOrgInfoService IOrgInfoService;
    @ApiOperation(value = "新增组织机构",notes = "新增组织实体")
    @ApiImplicitParam(name = "orgInfo",value = "组织实体",required = true)
    @ResponseBody
    @RequestMapping("/insertOrgInfo")
    public void insertOrgInfo(@RequestBody OrgInfo orgInfo){
        IOrgInfoService.insert(orgInfo);
    }

    @ApiOperation(value = "根据ID删除组织实体",notes = "根据CID删除组织实体")
    @ApiImplicitParam(name = "Oid",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/deleteOrgInfoByOid/{oid}")
    public void deleteRuleInfoByCid(@PathVariable("oid") Integer oid){
        IOrgInfoService.deleteById(oid);
    }

    @ApiOperation(value = "根据ID查询组织机构实体",notes = "根据ID查询组织机构实体")
    @ApiImplicitParam(name = "id",value = "主键ID",required = true)
    @ResponseBody
    @GetMapping("/selectOrgInfoByCid/{Oid}")
    public OrgInfo selectOrgInfoByOid(@PathVariable("Oid")int oid){
        return IOrgInfoService.selectById(oid);
    }

    @ApiOperation(value = "查询所有组织机构实体分页",notes = "查询所有组织机构实体分页")
    @ResponseBody
    @GetMapping("/selectOrgInfoPageList")
    public Page<OrgInfo> selectOrgInfoPageList(){
        return IOrgInfoService.selectPage(new Page<OrgInfo>());
    }

    @ApiOperation(value = "查询所有班次实体",notes = "查询所有班次实体")
    @ResponseBody
    @GetMapping("/selectOrgInfoList")
    public List<OrgInfo> selectOrgInfoList(){
        return IOrgInfoService.selectList(null);
    }

    @ApiOperation(value = "修改组织机构实体",notes = "修改组织机构实体")
    @ApiImplicitParam(name = "OrgInfo",value = "组织机构实体",required = true)
    @ResponseBody
    @RequestMapping("/updateOrginfo")
    public void updateOrgInfo(@RequestBody OrgInfo OrgInfo){
        IOrgInfoService.updateById(OrgInfo);
    }



}

