package com.shicongyuan.signin.makeclass.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

@TableName("makeclass")
public class Makeclass extends Model<Makeclass> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private String cid;//'标识列' ,
    private String cname;//'排班说明',
    private String schedulingCycle;//'排班周期'

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSchedulingCycle() {
        return schedulingCycle;
    }

    public void setSchedulingCycle(String schedulingCycle) {
        this.schedulingCycle = schedulingCycle;
    }

    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}
