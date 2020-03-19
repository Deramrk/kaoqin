package com.shicongyuan.signin.overtimeRule.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

@TableName("overtime_rule")
public class OvertimeRule extends Model<OvertimeRule> {

    private static final long serialVersionUID =1L;

    @TableId(value="oid",type= IdType.AUTO)
    private int oid;//'标识列',
    private String oname;//'加班规则名称',
    private String ocontent;//'加班内容',
    private String scope;//'加班范围'

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOcontent() {
        return ocontent;
    }

    public void setOcontent(String ocontent) {
        this.ocontent = ocontent;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    protected Serializable pkVal() {
        return this.oid;
    }
}
