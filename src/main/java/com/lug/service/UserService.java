package com.lug.service;
import com.lug.dao.UserDaoTypeOne;
import com.lug.dao.UserDaoTypeTwo;
import com.lug.mybatis.mapper.UserDao;
import com.lug.mybatis.mapper.UserMapper;
import com.lug.mybatis.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService {

    @Resource(name="userMapper")
    private UserMapper dao;

    @Resource
    private UserDao userDao;

    @Resource
    private UserDaoTypeOne typeOneDao;

    @Resource
    private UserDaoTypeTwo typeTwoDao;

    public void saveOne(User user){typeOneDao.save(user);}

    public void saveTwo(User user){typeTwoDao.save(user);}

    public void save(User user){
        dao.save(user);
    }

    public void saveDao(User user){
        userDao.save(user);
    }

    public com.lug.model.User findUserByName(String username) {
        return new com.lug.model.User();
    }

    public List<User> findAllByTypeOne(){
        return typeOneDao.findAllUsers();
    }
}
