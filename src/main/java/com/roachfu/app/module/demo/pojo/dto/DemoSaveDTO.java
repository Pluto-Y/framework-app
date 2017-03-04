package com.roachfu.app.module.demo.pojo.dto;

import java.io.Serializable;

/**
 * 添加demo的数据传输对象
 * @author fuqiang
 * @time 2017/2/27 23:11
 */
public class DemoSaveDTO implements Serializable {

    private static final long serialVersionUID = -6858772562134176280L;

    private String demoName;

    private Integer demoValue;

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

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}
