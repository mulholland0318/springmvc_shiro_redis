package com.lug.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lug.mybatis.mapper.UserMapper;
import com.lug.mybatis.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userCacheService")
public class UserCacheService implements BaseService<User>{

    @Resource(name = "userMapper")
    private UserMapper dao;


    @Override
    public long save(User user) {
        return 0;
    }

    @Override
    public long update(User user) {
        return 0;
    }

    @Override
    public long delete(String id) {
        return 0;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public Page<User> findPage(Object obj) {
        return null;
    }

    @Override
    public PageInfo<User> findPageInfo(Object obj) {
        return null;
    }
}
