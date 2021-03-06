package com.roachfu.app.pojo.entity;

import com.roachfu.app.pojo.enums.ErrorTypeEnum;

import java.io.Serializable;

/**
 * 错误信息元数据
 * @author fuqiang
 * @time 2017/2/26 21:16
 */
public class Meta implements Serializable{

    private static final long serialVersionUID = -6874412483876975059L;

    /** 错误代码 */
    private Integer code;

    /** 错误信息 */
    private String msg;

    public Meta() {
        // 无参构造器
    }

    public Meta(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Meta(ErrorTypeEnum errorType){
        this.code = errorType.getCode();
        this.msg = errorType.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}
