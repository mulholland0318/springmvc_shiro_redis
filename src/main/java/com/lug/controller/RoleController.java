package com.lug.controller;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;

@Controller
public class RoleController extends BaseController{

    @RequestMapping("/role")
    public Object roleSave(){
        return "success";
    }
    @RequestMapping("/role/delete")
    public Object roleDelete(){
        return "success";
    }

    @ExceptionHandler({UnauthorizedException.class})
    @ResponseStatus( HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Object processUnauthenticatedException(NativeWebRequest request, UnauthorizedException e) {
        /*ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        mv.setViewName("unauthorized");*/
        System.out.println("unauthorized");
        return "exception";
    }

}
