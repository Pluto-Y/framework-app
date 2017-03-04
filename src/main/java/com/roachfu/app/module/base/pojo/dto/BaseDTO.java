package com.roachfu.app.module.base.pojo.dto;

import java.io.Serializable;

/**
 * 基础请求实体
 * @author fuqiang
 * @time 2017/2/28 22:54
 */
public class BaseDTO implements Serializable {

    private static final long serialVersionUID = 8134394573159719212L;

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}
