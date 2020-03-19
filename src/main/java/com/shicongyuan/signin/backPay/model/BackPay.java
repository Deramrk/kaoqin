package com.shicongyuan.signin.backPay.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

public class BackPay extends Model<BackPay> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "bid", type = IdType.AUTO)
    private int bid;//'标识列',
    private String bname;//'补卡规则名称',
    private String bcontent;//'补卡加班内容',
    private String bscope;//'补卡范围'

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBscope() {
        return bscope;
    }

    public void setBscope(String bscope) {
        this.bscope = bscope;
    }

    @Override
    protected Serializable pkVal() {
        return this.bid;
    }


}
