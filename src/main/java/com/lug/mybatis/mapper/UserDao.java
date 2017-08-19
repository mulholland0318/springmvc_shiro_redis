package com.lug.mybatis.mapper;

import com.lug.mybatis.model.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserDao extends SqlMapper{
    public void save(User user);
}
