package com.shicongyuan.signin.classes.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

@TableName(value="classes")
public class Classes extends Model<Classes> {

    private static final long serialVersionUID =1L;

    @TableId(value="cid", type = IdType.AUTO)
    private int cid;//'标识列' ,
    private String printTime;//'打卡时间',
    private String breakTime;//'休息时间',
    private String clockFrequency;//'打卡天数',
    private String clockSettings;//'打卡高级设置',
    private String elasticClock;//'弹性打卡'

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getPrintTime() {
        return printTime;
    }

    public void setPrintTime(String printTime) {
        this.printTime = printTime;
    }

    public String getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(String breakTime) {
        this.breakTime = breakTime;
    }

    public String getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(String clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public String getClockSettings() {
        return clockSettings;
    }

    public void setClockSettings(String clockSettings) {
        this.clockSettings = clockSettings;
    }

    public String getElasticClock() {
        return elasticClock;
    }

    public void setElasticClock(String elasticClock) {
        this.elasticClock = elasticClock;
    }

    @Override
    protected Serializable pkVal() {
        return this.cid;
    }
}
