package com.yxl.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Test01 {
    @RequestMapping("/hello") //标识请求路径
    public String hello(String name){
        System.out.println("Test01 ... hello: " + name);
        return "Hello " + name;
    }
    @RequestMapping("/list") //标识请求路径
    public String list(String name){
        System.out.println("Test01 ... list: " + name);
        return "list " + name;
    }
    @RequestMapping("/user/list") //标识请求路径
    public String userList(String name){
        System.out.println("Test01 ... userList: " + name);
        return "userList" + name;
    }


    /**
     * 请求路径 http://localhost:8080/request?name=Tom&age=18
     */
    @RequestMapping("/request")
    public String request(HttpServletRequest reques){
        //1.获取请求参数 name, age
        String name = reques.getParameter("name");
        String age = reques.getParameter("age");
        System.out.println("name = " + name + ", age = " + age);
        //2.获取请求路径
        String requestURI = reques.getRequestURI();
        String url = reques.getRequestURL().toString();
        System.out.println("RequestURI = "+requestURI);
        System.out.println("url = "+url);
        //3.获取请求方式
        String userAgent = reques.getHeader("user-agent");
        System.out.println("userAgent = :"+userAgent);
        //4.获取请求头
        String queryString = reques.getQueryString();
        System.out.println("queryString = :"+queryString);
        return "success";
    }
    @RequestMapping("/response")
    public void response(HttpServletResponse response)throws IOException{

        response.setStatus(8848);
        //2.设置响应头
        response.setHeader("name","itcast");
        //3.设置响应体
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("<h1>岸宝</h1> <img src=\"https://img0.baidu.com/it/u=3202903006,3592669375&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=1200\" > ");
    }
    @RequestMapping("/response2")
    public ResponseEntity<String> response2(HttpServletResponse response)throws IOException{
        //1.设置响应状态码
        return ResponseEntity.status(888)//1.设置响应状态码
                .header("name","itcast") //2.设置响应头
                .body("<h1>hello response</h1>"); //3.设置响应体
    }

}
