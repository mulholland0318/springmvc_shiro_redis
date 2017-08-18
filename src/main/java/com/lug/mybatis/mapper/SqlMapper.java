package com.lug.mybatis.mapper;

import java.util.List;

public interface SqlMapper {
    public void save();

    public void delete(String id);

    public void update(Object obj);

    public List<Object> findAll();

    public Object findById();
}
