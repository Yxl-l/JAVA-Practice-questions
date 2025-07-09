package com.exam.mvc;


import com.exam.interceptor.TokenInterceptorAddUserPermissions;
import com.exam.interceptor.TokenInterceptorOperationalAuthorityFunctionBlocker;
import com.exam.interceptor.TokenInterceptorQueryUserPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private TokenInterceptorQueryUserPermissions tokenInterceptorQueryUserPermissions;//拦截查询用户权限
    @Autowired
    private TokenInterceptorAddUserPermissions tokenInterceptorAddUserPermissions;//拦截新增用户功能权限，拦截修改用户角色功能
    @Autowired
    private TokenInterceptorOperationalAuthorityFunctionBlocker tokenInterceptorOperationalAuthorityFunctionBlocker;
    //添加用户功能，修改用户功能  拦截器
 @Override
    public void addInterceptors(InterceptorRegistry registry) {
     // 只拦截查询用户权限接口
     registry.addInterceptor(tokenInterceptorQueryUserPermissions)
             .addPathPatterns("/user/p");

     // 只拦截新增用户接口,修改用户角色功能口
     registry.addInterceptor(tokenInterceptorAddUserPermissions)
             .addPathPatterns("/user/add","/user/update");
    //只拦截添加用户功能，修改用户功能  接口
    registry.addInterceptor(tokenInterceptorOperationalAuthorityFunctionBlocker)
            .addPathPatterns("/user/add/rp","/user/del/rp");


};
}
