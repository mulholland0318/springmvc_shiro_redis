package com.lug.mybatis.model;

import java.util.List;

public class Page<T> {
    private long pageNum = 1;   //页号
    private long pageSize = 10;  //单元数量


    public List<T> list = null;

    public long getPageNum() {
        return pageNum;
    }

    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
