package com.lug.service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lug.dao.UserDaoTypeOne;
import com.lug.dao.UserDaoTypeTwo;
import com.lug.mybatis.mapper.SqlMapper;
import com.lug.mybatis.mapper.UserDao;
import com.lug.mybatis.mapper.UserMapper;
import com.lug.mybatis.model.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("userService")
public class UserService implements BaseService<User>{

    @Resource(name="userMapper")
    private UserMapper dao;

    public long save(User user){
        return dao.save(user);
    }

    @Override
    public long update(User user) {
        return dao.update(user);
    }

    @Override
    public long delete(String id) {
        return dao.delete(id);
    }

    @Override
    public User findById(String id) {
        return dao.findById(id);
    }

    @Override
    public Page<User> findPage(Object obj) {
        return dao.findPageByParam(obj);
    }

    @Override
    public PageInfo<User> findPageInfo(Object obj) {
        return dao.findByParam(obj);
    }


}
