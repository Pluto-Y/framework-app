package com.roachfu.app.pojo.entity;

import java.io.Serializable;

/**
 * 分页实体
 *
 * @author fuqiang
 * @time 2017/2/26 14:58
 */
public class Page implements Serializable {

    /** 页码 */
    private int pageNo;

    /** 页大小 */
    private int pageSize;

    public Page() {
        this.pageNo = 1;
        this.pageSize = 10;
    }

    public Page(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageStart() {
        return (this.pageNo - 1) * this.pageSize;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
    }
}
