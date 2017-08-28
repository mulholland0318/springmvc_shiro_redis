package com.lug.shiro;

import com.lug.model.Module;
import com.lug.model.Role;
import com.lug.model.User;
import com.lug.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class AuthReam extends AuthorizingRealm {
    @Resource
    private UserService userService;


    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("授权");
        //获取当前用户
        User user = (User)principals.fromRealm(getName()).iterator().next();
        //得到权限字符串
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        Set<Role> roles = user.getRoles();
        List<String> list = new ArrayList();
        for(Role role :roles){
            Set<Module> modules = role.getModules();
            for(Module m:modules){
                if(m.getCtype()==0){
                    //说明是主菜单
                    list.add(m.getCpermission());
                }
            }
        }

        info.addStringPermissions(list);
        return info;
    }
    //认证  登录
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
        System.out.println("认证");
        UsernamePasswordToken upToken = (UsernamePasswordToken)token;


        User user = null;//userService.findById("a");
        if(user == null){
            return null;
        }else{
            AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
            return info;
        }

    }
}
