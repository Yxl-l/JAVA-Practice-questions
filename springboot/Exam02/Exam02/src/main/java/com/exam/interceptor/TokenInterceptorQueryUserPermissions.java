package com.exam.interceptor;


import com.exam.Utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.List;
import java.util.Map;

@Slf4j
@Component
/**
 * 查询用户功能权限拦截器TokenInterceptor
 */
public class TokenInterceptorQueryUserPermissions implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("令牌校验执行了");
        String token = request.getHeader("token");// 获取请求头中的令牌（token）。
        Map<String, Object> map = JwtUtils.parseJWT(token);
        List<String> permissions = (List<String>) map.get("permissions");//从令牌token中解析出当前用户权限集合
        if (ObjectUtils.isEmpty(token) || map == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);//报错401
            log.info("令牌不合法不放行，请登录合法用户");
            return false;
        } else if (permissions != null && (permissions.contains("查看用户") || permissions.contains("超级管理员"))){
            //用户有对应权限或者超级管理员权限才能放行
            log.info("有【查看用户】权限，放行");
            return true;
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);//报错401
            log.info("用户没有【查看用户】权限，禁止访问");
            return false;
        }

    }


//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        log.info("方法执行完毕且数据渲染完成，清空当前线程暂存数据");
//        //7. 清空当前线程ThreadLocal暂时存储的数据
////        CurrentHolder.remove();
//    }
//}
}