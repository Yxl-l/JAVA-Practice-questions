package com.exam.controller;

import com.exam.pojo.Result;
import com.exam.pojo.User;
import com.exam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    private UserService userService;

/**
 * 新增用户
 */
@PostMapping
    public Result postUser(@RequestBody User user){
    log.info("添加用户{}",user);
    userService.postUser(user);
    return Result.success("添加成功");
}

}
