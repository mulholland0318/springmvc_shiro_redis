package com.lug.mybatis.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan("baseMapper")
public interface SqlMapper<T> {
    public long save(T t);

    public long delete(String id);

    public long update(T t);

    public List<T> findAll();

    public T findById(String id);

    public PageInfo<T> findByParam(Object obj);

    public Page<T> findPageByParam(Object obj);
}
