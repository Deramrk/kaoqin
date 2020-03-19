package com.shicongyuan.signin.vacationRule.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName("vacation_rule")
public class VacationRule extends Model<VacationRule> {

    private static final long serialVersionUID = 1L;

    private int vid;//'标识列' ,
    private String vname;//'假期名称' ,
    private String vunit;//'请假的单位',
    private String computerWay;//'请假时长方式',
    private String balanceRule;//'假期余额规则',
    private String scope;//'使用范围'

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getVunit() {
        return vunit;
    }

    public void setVunit(String vunit) {
        this.vunit = vunit;
    }

    public String getComputerWay() {
        return computerWay;
    }

    public void setComputerWay(String computerWay) {
        this.computerWay = computerWay;
    }

    public String getBalanceRule() {
        return balanceRule;
    }

    public void setBalanceRule(String balanceRule) {
        this.balanceRule = balanceRule;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    protected Serializable pkVal() {
        return this.vid;
    }
}
