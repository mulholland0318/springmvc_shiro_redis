package com.lug.controller;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

   /* @RequestMapping("/")
    public String defaultIndex(){
        return "index";
    }*/

   @RequestMapping("/index")
   public String defaultIndex(){
       System.out.println("defaultindex");
       return "index";
   }


    @RequestMapping("/home/index")
    public String index(){
        System.out.println("index");
        logger.info("index page jump");
        return "index";
    }

    @RequiresRoles("admin")
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/helloRedirect")
    public String helloRedirect(){
        System.out.println("helloRedirect");
        return "redirect:/hello";
    }

    @RequestMapping("/helloForward")
    public String helloForward(){
        System.out.println("helloForward");
        return "forward:/hello";
    }
}
