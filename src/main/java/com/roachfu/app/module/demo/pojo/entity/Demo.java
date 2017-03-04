package com.roachfu.app.module.demo.pojo.entity;

import com.roachfu.app.util.APIUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * demo实体
 * @author fuqiang
 * @time 2017/2/26 16:45
 */
public class Demo implements Serializable {

    private static final long serialVersionUID = -8044492176969321081L;

    private String id;

    private String demoName;

    private Integer demoValue;

    /**
     * demo状态：0=删除、1=正常
     */
    private Integer demoStatus;

    private Date updateTime;

    private Date createTime;

    public void init(){
        this.id = APIUtils.uuid();
        this.createTime = new Date();
        this.updateTime = new Date();
        this.demoStatus = 1;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public Integer getDemoValue() {
        return demoValue;
    }

    public void setDemoValue(Integer demoValue) {
        this.demoValue = demoValue;
    }

    public Integer getDemoStatus() {
        return demoStatus;
    }

    public void setDemoStatus(Integer demoStatus) {
        this.demoStatus = demoStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}
