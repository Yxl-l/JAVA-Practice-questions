package com.yxl.demo02.controller;

import com.yxl.demo02.pojo.User;
import com.yxl.demo02.service.UserService2;
import com.yxl.demo02.service.impl.UserServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController2 {
    @Autowired
    private UserServiceImpl2 userServiceImpl2;
    @RequestMapping("ww")
    public List<User> list3 (){

        return  userServiceImpl2.UserService2User();
    }
}
