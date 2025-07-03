package com.yxl.filter;

import com.yxl.utils.JwtUtils;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
@Slf4j
//@WebFilter("/*") //配置过滤器要拦截的请求路径（ /* 表示拦截浏览器的所有请求 ）
public class DemoFilter01 implements Filter {

    //初始化方法, web服务器启动, 创建Filter实例时调用, 只调用一次
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init---------------");
    }

    //拦截到请求时,调用该方法,可以调用多次
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        强转HttpServletRequest HttpServletResponse
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        //1. 获取请求url。
        String url = httpServletRequest.getRequestURL().toString();
        //2. 判断请求url中是否包含login，如果包含，说明是登录操作，放行。
        if(url.contains("/login")){
            log.info("登录请求 , 直接放行");
            filterChain.doFilter(httpServletRequest,httpServletResponse);
            return;
        }
        //3. 获取请求头中的令牌（token）。
        String token = httpServletRequest.getHeader("token");
       //4. 判断令牌是否存在，如果不存在，返回错误结果（未登录）。 解析token，如果解析失败，返回错误结果（未登录）。
        if (ObjectUtils.isEmpty(token) || JwtUtils.parseJWT(token)==null){
            httpServletResponse.setStatus(HttpStatus.SC_UNAUTHORIZED);
            return;
        }
//        5. 放行。
        log.info("令牌合法, 放行");
       filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    //销毁方法, web服务器关闭时调用, 只调用一次
    @Override
    public void destroy() {
        System.out.println("destroy ... ");
    }
}