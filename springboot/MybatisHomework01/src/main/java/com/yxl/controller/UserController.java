package com.yxl.controller;

import com.yxl.pojo.User;
import com.yxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
private UserService userService;
    @RequestMapping("/select")
    public User selectUser (Integer id){
        return  userService.userSelect(id);
    }
}
