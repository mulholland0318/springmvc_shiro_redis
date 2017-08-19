package com.lug.dao;

import com.lug.mybatis.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoTypeTwo {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void save(User user){
        sqlSessionTemplate.insert("UserMapper.save",user);
    }
}
