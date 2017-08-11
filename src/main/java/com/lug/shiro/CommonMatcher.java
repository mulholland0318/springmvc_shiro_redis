package com.lug.shiro;

import com.lug.shiro.util.Encrypt;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

public class CommonMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;

        //注意token.getPassword()拿到的是一个char[]，不能直接用toString()，它底层实现不是我们想的直接字符串，只能强转
        Object tokenCredentials = Encrypt.md5(String.valueOf(userToken.getPassword()),userToken.getUsername());
        Object accountCredentials = getCredentials(info);

        return equals(tokenCredentials,accountCredentials);
    }
}
