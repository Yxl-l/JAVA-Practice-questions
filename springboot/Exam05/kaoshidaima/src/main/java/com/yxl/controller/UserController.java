package com.yxl.controller;

import com.yxl.pojo.LoginInfo;
import com.yxl.pojo.Result;
import com.yxl.pojo.User;
import com.yxl.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {
    private final UserService userService;


    /**
     * 登录
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        log.info("员工来登录啦 , {}", user);
        //获取登录信息对象实列LoginInfo
        LoginInfo loginInfo = userService.login(user);
        if(loginInfo != null){
            log.info("登陆成功");
            return Result.success(loginInfo);
        }
        log.info("登录失败");
        return Result.error("登陆失败请核对用户名密码");
    }
}
