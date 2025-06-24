package com.yxl.coneroller;

import com.yxl.pojo.Result;
import com.yxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public Result getUserAll(){

        return Result.success(userService.getUserAll());
    }
    @GetMapping("/go5")
    public Result getUser5(Integer number){
        //接收当前页码
        return Result.success(userService.getUser5(number));
    }
}
