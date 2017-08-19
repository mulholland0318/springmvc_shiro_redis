package com.lug.mybatis.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import com.lug.mybatis.model.User;

import java.util.List;

@MapperScan
public interface UserMapper extends SqlMapper{
    public void save(User user);


    public List<User> findAll();

}
