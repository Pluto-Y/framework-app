package com.roachfu.app.pojo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 返回数据实体
 * @author fuqiang
 * @time 2017/2/26 21:41
 */

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class APIResponse implements Serializable {

    private static final long serialVersionUID = -7752998218249490040L;

    /** 错误信息元数据 */
    private Meta meta;

    /** 返回结果 */
    private transient Object data;

    public APIResponse() {
        this.meta = new Meta(200, "ok");
    }

    public APIResponse(Object data){
        this.meta = new Meta(200, "ok");
        if(data != null){
            this.data = data;
        }
    }

    public APIResponse(Meta meta, Object data) {
        this.meta = meta;
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}
