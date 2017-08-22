package com.lug.dao;

import com.lug.mybatis.model.User;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoTypeOne extends SqlSessionDaoSupport {

    private SqlSession sqlSession = getSqlSession();

    public void save(User user){
        getSqlSession().insert("UserMapper.save",user);
    }

    public List<User> findAllUsers(){
        RowBounds rb = new RowBounds(0,10);
        return getSqlSession().selectList("UserMapper.findAll",null,rb);
    }


    //必须要注入该sqlSessionFactory 否则报错
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
