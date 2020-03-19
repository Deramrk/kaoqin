package com.shicongyuan.signin.attendanceinfo.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LXG
 * @since 2020-03-19
 */
@TableName("attendance_info")
public class AttendanceInfo extends Model<AttendanceInfo> {

    private static final long serialVersionUID = 1L;

    /**
     *  id 
     */
    private Integer id;
    /**
     *  uid 
     */
    private String uid;
    /**
     *  考勤人 
     */
    @TableField("attendance_name")
    private byte[] attendanceName;
    /**
     *  考勤类型 
     */
    @TableField("attendance_type")
    private Integer attendanceType;
    /**
     *  创建时间 
     */
    @TableField("create_time")
    private Date createTime;
    /**
     *  状态 
     */
    @TableField("STATU")
    private Integer statu;
    /**
     *  顺序 
     */
    @TableField("ORDERS")
    private Integer orders;
    /**
     *  打卡天数 
     */
    @TableField("attendance_day")
    private Integer attendanceDay;
    /**
     *  休息天数
     */
    @TableField("rest_day")
    private Integer restDay;
    /**
     *  工作天数 
     */
    @TableField("work_day")
    private Float workDay;
    /**
     *  迟到次数 
     */
    @TableField("late_count")
    private Integer lateCount;
    /**
     *  迟到天数 
     */
    @TableField("late_day")
    private Float lateDay;
    /**
     *  旷工次数 
     */
    @TableField("absenteeism_count")
    private Integer absenteeismCount;
    /**
     *  矿工天数 
     */
    @TableField("absenteeism_day")
    private Float absenteeismDay;
    /**
     *  早退次数 
     */
    @TableField("leave_early_count")
    private Integer leaveEarlyCount;
    /**
     *  早退天数 
     */
    @TableField("leave_early_day")
    private Float leaveEarlyDay;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public byte[] getAttendanceName() {
        return attendanceName;
    }

    public void setAttendanceName(byte[] attendanceName) {
        this.attendanceName = attendanceName;
    }

    public Integer getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(Integer attendanceType) {
        this.attendanceType = attendanceType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getAttendanceDay() {
        return attendanceDay;
    }

    public void setAttendanceDay(Integer attendanceDay) {
        this.attendanceDay = attendanceDay;
    }

    public Integer getRestDay() {
        return restDay;
    }

    public void setRestDay(Integer restDay) {
        this.restDay = restDay;
    }

    public Float getWorkDay() {
        return workDay;
    }

    public void setWorkDay(Float workDay) {
        this.workDay = workDay;
    }

    public Integer getLateCount() {
        return lateCount;
    }

    public void setLateCount(Integer lateCount) {
        this.lateCount = lateCount;
    }

    public Float getLateDay() {
        return lateDay;
    }

    public void setLateDay(Float lateDay) {
        this.lateDay = lateDay;
    }

    public Integer getAbsenteeismCount() {
        return absenteeismCount;
    }

    public void setAbsenteeismCount(Integer absenteeismCount) {
        this.absenteeismCount = absenteeismCount;
    }

    public Float getAbsenteeismDay() {
        return absenteeismDay;
    }

    public void setAbsenteeismDay(Float absenteeismDay) {
        this.absenteeismDay = absenteeismDay;
    }

    public Integer getLeaveEarlyCount() {
        return leaveEarlyCount;
    }

    public void setLeaveEarlyCount(Integer leaveEarlyCount) {
        this.leaveEarlyCount = leaveEarlyCount;
    }

    public Float getLeaveEarlyDay() {
        return leaveEarlyDay;
    }

    public void setLeaveEarlyDay(Float leaveEarlyDay) {
        this.leaveEarlyDay = leaveEarlyDay;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AttendanceInfo{" +
        ", id=" + id +
        ", uid=" + uid +
        ", attendanceName=" + attendanceName +
        ", attendanceType=" + attendanceType +
        ", createTime=" + createTime +
        ", statu=" + statu +
        ", orders=" + orders +
        ", attendanceDay=" + attendanceDay +
        ", restDay=" + restDay +
        ", workDay=" + workDay +
        ", lateCount=" + lateCount +
        ", lateDay=" + lateDay +
        ", absenteeismCount=" + absenteeismCount +
        ", absenteeismDay=" + absenteeismDay +
        ", leaveEarlyCount=" + leaveEarlyCount +
        ", leaveEarlyDay=" + leaveEarlyDay +
        "}";
    }
}
