package com.lug.service;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lug.dao.UserDaoTypeOne;
import com.lug.dao.UserDaoTypeTwo;
import com.lug.mybatis.mapper.UserDao;
import com.lug.mybatis.mapper.UserMapper;
import com.lug.mybatis.model.User;
import org.apache.ibatis.session.RowBounds;

import javax.annotation.Resource;
import java.util.List;

public class DemoUserService {
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


    public void saveDao(User user){
        userDao.save(user);
    }

    public com.lug.model.User findUserByName(String username) {
        return new com.lug.model.User();
    }

    public List<User> findAllByTypeOne(){
        return typeOneDao.findAllUsers();
    }

    public List<User> findAllTypeThree(){
        PageHelper.startPage(0,10);
        return dao.findAll();
    }

    public List<User> findAllTypeThreeOne(){
        PageHelper.offsetPage(0,12);
        return dao.findAll();
    }


    public List<User> findAllByTypeThreeWithParam(int pageNum,int pageSize){
        return dao.findAll(pageNum,pageSize);
    }

    public List<User> findAllByPage(com.lug.mybatis.model.Page<User> page){
        return dao.findAllByPage(page);
    }

    public com.github.pagehelper.Page<User> findAllByInterface(){
        return PageHelper.startPage(1,7).doSelectPage(new ISelect() {
            public void doSelect() {
                dao.findAll();
            }
        });

    }


    public com.github.pagehelper.Page<User> findAllBylambda(){
        com.github.pagehelper.Page<User> page = PageHelper.startPage(1,9).doSelectPage(()-> dao.findAll());
        return page;
    }

    public PageInfo<User> findAllByPageInfo(){
        return PageHelper.startPage(1,11).doSelectPageInfo(()->dao.findAll());
    }


    public long findCount(){
        return PageHelper.count(()->dao.findAll());
    }


    public List<User> findAllByDefault(RowBounds rowBounds){
        if(null == rowBounds){
            rowBounds = new RowBounds(1,14);
        }
        return dao.findAll(rowBounds);
    }

    public long deleteById(String id){
        return dao.delete(id);
    }


    public long save(User user) {
        return dao.save(user);
    }

    public long update(User user){
        return dao.update(user);
    }


    public long delete(String id) {
        return dao.delete(id);
    }


    public User findById(String id) {
        return dao.findById(id);
    }

    public Page<User> findPage(Object obj) {
        return PageHelper.startPage(1,0).doSelectPage(()-> dao.findPageByParam(obj));
    }


    public PageInfo<User> findPageInfo(Object obj) {
        return dao.findByParam(obj);
    }

    public long deleteByPhone(String phone){
        return dao.deleteByPhone(phone);
    }
}
