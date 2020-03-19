package com.shicongyuan.signin.attendanceGroup.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

@TableName(value="attendance_group")
public class AttendanceGroup extends Model<AttendanceGroup> {

    private static final long serialVersionUID =1L;

    @TableId(value="tId", type = IdType.AUTO)
    private String tId;//'考勤组id 标识列'
    private String tAttendanceman;//'考勤组组人员',
    private String attendanceController;//'考勤负责人',
    private String attendanceType;//'考勤类型',
    private String workSet;//'工作日设置',
    private String specialSetup;// '特殊日期',
    private String localtionWork;//' 考勤地点 ',
    private String rulesFiled;// '外勤规则',
    private String addworkRules;//'加班规则'

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettAttendanceman() {
        return tAttendanceman;
    }

    public void settAttendanceman(String tAttendanceman) {
        this.tAttendanceman = tAttendanceman;
    }

    public String getAttendanceController() {
        return attendanceController;
    }

    public void setAttendanceController(String attendanceController) {
        this.attendanceController = attendanceController;
    }

    public String getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(String attendanceType) {
        this.attendanceType = attendanceType;
    }

    public String getWorkSet() {
        return workSet;
    }

    public void setWorkSet(String workSet) {
        this.workSet = workSet;
    }

    public String getSpecialSetup() {
        return specialSetup;
    }

    public void setSpecialSetup(String specialSetup) {
        this.specialSetup = specialSetup;
    }

    public String getLocaltionWork() {
        return localtionWork;
    }

    public void setLocaltionWork(String localtionWork) {
        this.localtionWork = localtionWork;
    }

    public String getRulesFiled() {
        return rulesFiled;
    }

    public void setRulesFiled(String rulesFiled) {
        this.rulesFiled = rulesFiled;
    }

    public String getAddworkRules() {
        return addworkRules;
    }

    public void setAddworkRules(String addworkRules) {
        this.addworkRules = addworkRules;
    }

    @Override
    protected Serializable pkVal() {
        return this.tId;
    }
}
