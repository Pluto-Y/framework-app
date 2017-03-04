package com.roachfu.app.module.demo.pojo.dto;

import java.io.Serializable;

/**
 * @author fuqiang
 * @time 2017/2/27 23:36
 */
public class DemoUpdateDTO implements Serializable {

    private static final long serialVersionUID = -1224223041419314334L;

    private String id;

    private String demoName;

    private Integer demoValue;

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

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}

