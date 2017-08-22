package com.lug.service;

import com.lug.mybatis.mapper.UserMapper;
import com.lug.mybatis.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userCacheService")
public class UserCacheService {

    @Resource
    private UserMapper dao;


    @Cacheable()
    public long save(User user){
        return dao.save(user);
    }

    @CacheEvict()
    public long delete(String id){
        return dao.delete(id);
    }

    @CachePut()
    public long update(User user){
        return dao.update(user);
    }

    @Cacheable()
    public User findById(String id){
        return dao.findById(id);
    }

}
