package com.lug.mybatis.mapper;

import com.lug.mybatis.model.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import com.lug.mybatis.model.User;

import java.util.List;

@MapperScan("userMapper")
public interface UserMapper extends SqlMapper<User>{

    public List<User> findAll();

    public List<User> findAll(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);

    public List<User> findAllByPage(Page<User> page);

    public List<User> findAll(RowBounds rowBounds);

    public long deleteByPhone(String phone);

}
