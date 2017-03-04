package com.roachfu.app.module.base.pojo.vo;

import java.io.Serializable;

/**
 * 基础响应
 *
 * @author fuqiang
 * @time 2017/3/1 0:36
 */
public class BaseVO implements Serializable {

    private static final long serialVersionUID = 6636423246539664644L;

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}
