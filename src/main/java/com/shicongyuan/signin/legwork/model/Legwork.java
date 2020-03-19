package com.shicongyuan.signin.legwork.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

@TableName("legwork")
public class Legwork extends Model{

    private static final long serialVersionUID = 1L;

    @TableId(value = "lid", type = IdType.AUTO)
    private int lid;//'标识列' ,
    private String lname;//'外勤名字' ,
    private String pickGroup;//'选择分组',
    private String canOriginator;//'可发起人',
    private String manageablePersonnel;//'可管理人',
    private String examineExplain;//'审批说明',
    private String icon;//'图标'

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPickGroup() {
        return pickGroup;
    }

    public void setPickGroup(String pickGroup) {
        this.pickGroup = pickGroup;
    }

    public String getCanOriginator() {
        return canOriginator;
    }

    public void setCanOriginator(String canOriginator) {
        this.canOriginator = canOriginator;
    }

    public String getManageablePersonnel() {
        return manageablePersonnel;
    }

    public void setManageablePersonnel(String manageablePersonnel) {
        this.manageablePersonnel = manageablePersonnel;
    }

    public String getExamineExplain() {
        return examineExplain;
    }

    public void setExamineExplain(String examineExplain) {
        this.examineExplain = examineExplain;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    protected Serializable pkVal() {
        return this.lid;
    }
}
