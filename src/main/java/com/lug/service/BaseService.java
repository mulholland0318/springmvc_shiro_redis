package com.lug.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lug.mybatis.mapper.SqlMapper;

public interface BaseService<T> {
    public long save(T t);

    public long update(T t);

    public long delete(String id);

    public T findById(String id);

    public Page<T> findPage(Object obj);

    public PageInfo<T> findPageInfo(Object obj);
}
