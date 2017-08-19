package com.lug.service;
import com.lug.mybatis.mapper.UserDao;
import com.lug.mybatis.mapper.UserMapper;
import com.lug.mybatis.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService {

    @Resource(name="userMapper")
    private UserMapper dao;

    @Resource
    private UserDao userDao;

    public void save(User user){
        dao.save(user);
    }

    public void saveDao(User user){
        userDao.save(user);
    }

    public com.lug.model.User findUserByName(String username) {
        return new com.lug.model.User();
    }
}
