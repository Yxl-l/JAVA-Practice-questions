package com.yxl.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test01 {
    @RequestMapping("/hello") //标识请求路径
    public String hello(String name){
        System.out.println("Test01 ... hello: " + name);
        return "Hello " + name;
    }
}
