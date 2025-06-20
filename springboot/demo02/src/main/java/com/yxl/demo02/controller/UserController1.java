package com.yxl.demo02.controller;

import com.yxl.demo02.pojo.User;
import com.yxl.demo02.service.UserSerivce1;
import com.yxl.demo02.service.impl.UserSerivceImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController1 {
    @Autowired
    private UserSerivceImpl1 userSerivce1;
    @RequestMapping("/qqq")
    public List<User>  list (){


return userSerivce1.findAll();
    }
}
