package com.shicongyuan.signin.orginfo.model;

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
@TableName("org_info")
public class OrgInfo extends Model<OrgInfo> {

    private static final long serialVersionUID = 1L;

    /**
     *  id 
     */
    private Integer id;
    /**
     *  组织机构 
     */
    @TableField("org_name")
    private String orgName;
    /**
     *  pid 
     */
    private Integer pid;
    /**
     *  创建时间  
     */
    @TableField("create_time")
    private Date createTime;
    /**
     *  状态 
     */
    @TableField("STATUS")
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrgInfo{" +
        ", id=" + id +
        ", orgName=" + orgName +
        ", pid=" + pid +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
