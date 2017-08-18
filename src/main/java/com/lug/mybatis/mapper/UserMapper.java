package com.lug.mybatis.mapper;

import org.springframework.stereotype.Service;


import com.lug.mybatis.model.User;
@Service("userMapper")
public interface UserMapper {
    public void save(User user);
}
