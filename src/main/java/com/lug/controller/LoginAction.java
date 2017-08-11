package com.lug.controller;

import com.lug.constant.SysConstant;
import com.lug.model.Module;
import com.lug.model.Role;
import com.lug.model.User;
import com.lug.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import java.util.Set;

import static org.apache.shiro.session.Session.*;

public class LoginAction {

    private static final long serialVersionUID = 1L;

    private static String   SUCCESS = "";

    private String username;
    private String password;

    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String login() throws Exception {    
        /*
         * shiro登录方式：根据用户名获取密码，密码为null非法用户；有密码检查是否用户填写的密码
         * 登录成功后无需往httpsession中存放当前用户，这样就跟web容器绑定，关联太紧密；它自己创建
         * subject对象，实现自己的session。这个跟web容器脱离，实现松耦合。
         */

        //调用shiro判断当前用户是否是系统用户
        Subject subject = SecurityUtils.getSubject();   //得到当前用户
        //shiro是将用户录入的登录名和密码（未加密）封装到token对象中
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        Session session = subject.getSession();
        try{
            subject.login(token);   //自动调用AuthRealm.doGetAuthenticationInfo

            //写seesion，保存当前user对象
            User curUser = (User)subject.getPrincipal();            //从shiro中获取当前用户
            System.out.println(curUser.getDept().getDeptName());    //让懒加载变成立即加载
            Set<Role> roles = curUser.getRoles();
            for(Role role :roles){
                Set<Module> moduless =  role.getModules();
                for(Module m :moduless)
                   System.out.println(m.getName());
            }
            session.setAttribute(SysConstant.CURRENT_USER_INFO, curUser);    //Principal 当前用户对象
        }catch(Exception ex){
            System.out.println("用户名密码错误，请重新填写!");
            ex.printStackTrace();

            return "login";
        }
        return SUCCESS;
    }

    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        Session session12 = subject.getSession();
        session12.removeAttribute(SysConstant.CURRENT_USER_INFO);      //删除session)
        return "logout";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}