package com.roachfu.app.module.demo.pojo.vo;

import com.roachfu.app.module.base.pojo.vo.BaseVO;

import java.util.Date;

/**
 * @author fuqiang
 * @time 2017/3/1 0:35
 */
public class DemoInfoVo extends BaseVO {

    private static final long serialVersionUID = -7315927016100229138L;

    private String id;

    private String demoName;

    private Integer demoValue;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
