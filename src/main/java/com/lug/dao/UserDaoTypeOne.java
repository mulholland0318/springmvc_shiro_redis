package com.lug.dao;

import com.lug.mybatis.model.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoTypeOne extends SqlSessionDaoSupport {

    public void save(User user){
        getSqlSession().insert("UserMapper.save",user);
    }

    //必须要注入该sqlSessionFactory 否则报错
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
