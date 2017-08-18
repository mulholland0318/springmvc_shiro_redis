package com.lug.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("login is runing ");
        return "login";
    }

    @RequestMapping("/login/shirologin")
    public ModelAndView shiroLogin(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        request.getSession().setAttribute("aa","httpSession");
        String sessionId = request.getSession().getId();
        System.out.println("httpSessionid is :"+sessionId);

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        String id = (String) session.getId();
        System.out.println("Shiro sessionId is"+id);
        session.setAttribute("shiro","shiroA");
        mv.setViewName("shiro");
        return mv;
    }

    @RequestMapping("/login/findSession")
    public ModelAndView getSessionAttr(HttpServletRequest request,HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        mv.addObject("httpSession",request.getSession().getAttribute("aa"));
        mv.addObject("shiroSession",SecurityUtils.getSubject().getSession().getAttribute("shiro"));
        mv.setViewName("shiroSession");


        return mv;
    }
}
