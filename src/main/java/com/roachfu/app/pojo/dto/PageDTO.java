package com.roachfu.app.pojo.dto;

import java.io.Serializable;

/**
 * @author fuqiang
 * @time 2017/3/1 21:43
 */
public class PageDTO implements Serializable {

    /** 页码 */
    private int pageNo;

    /** 页大小 */
    private int pageSize;

    public PageDTO() {
        this.pageNo = 1;
        this.pageSize = 10;
    }

    public PageDTO(int pageNo, int pageSize) {
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
}
