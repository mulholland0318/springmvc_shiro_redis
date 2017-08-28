package com.lug.controller;

import com.lug.mybatis.model.User;
import com.lug.service.UserCacheService;
import com.lug.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Resource
    private UserService service;

    @RequestMapping("/save")
    @ResponseBody
    public Object userSave(@RequestParam("username")String username,@RequestParam("password")String password){
        User user = new User();
        user.setId(getId());
        user.setPassword(username);
        user.setPassword(password);
        user.setPhone("13516269745");
        service.save(user);
        return "success";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object deleteUser(@RequestParam("id")String id){
        service.delete(id);
        return "success";
    }

    @RequestMapping("/update")
    @ResponseBody
    public Object updateUser(@RequestParam User user){
        service.update(user);
        return "success";
    }

    @RequestMapping("findById")
    @ResponseBody
    public User findById(@RequestParam("id") String id){

        return service.findById(id);
    }
}
