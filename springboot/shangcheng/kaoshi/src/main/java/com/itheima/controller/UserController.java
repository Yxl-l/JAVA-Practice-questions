package com.itheima.controller;


import com.itheima.pojo.*;
import com.itheima.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public PageResult page(UserParam userParam){
        return userService.page(userParam);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        LoginInfo login = userService.login(user);
        if (login == null){
            return Result.error("用户名或密码错误");
        }else {
            return Result.success(login);
        }
    }

}
