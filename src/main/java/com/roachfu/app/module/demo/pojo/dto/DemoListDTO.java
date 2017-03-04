package com.roachfu.app.module.demo.pojo.dto;

import java.io.Serializable;

/**
 * Demo 列表请求实体
 *
 * @author fuqiang
 * @time 2017/2/28 22:18
 */
public class DemoListDTO implements Serializable {

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
