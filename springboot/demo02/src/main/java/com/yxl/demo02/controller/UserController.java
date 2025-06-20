package com.yxl.demo02.controller;

import com.yxl.demo02.service.UserSerivce;
import com.yxl.demo02.service.impl.UserSerivceImpl;
import com.yxl.demo02.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserSerivce userSerivce;
    @RequestMapping("/list")
    public List<User> list(){
        List<User> userList = userSerivce.findAll();
        return userList;


    }
}
