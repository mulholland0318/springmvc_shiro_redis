package com.lug.controller.login;

import com.fasterxml.jackson.annotation.JsonView;
import com.lug.common.Response;
import com.lug.common.view.View;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {

    @RequestMapping("/login.do")
    @JsonView(View.SummaryWithMoreDetail.class)
    public Object login(@RequestParam("username")String username, @RequestParam("password") String password,String code){

        Response response = new Response();





        return response;

    }
}
