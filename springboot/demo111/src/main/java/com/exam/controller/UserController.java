package com.exam.controller;

import com.exam.pojo.LoginInfo;
import com.exam.pojo.Result;
import com.exam.pojo.User;
import com.exam.pojo.UserResult;
import com.exam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
@Autowired
    private UserService userService;

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
            return Result.success(loginInfo.getToken());
        }
        log.info("登录失败");
        return Result.error("登陆失败请核对用户名密码");
    }

/**
 * 分页列表
 */
@PostMapping()
    public Result getUserList(@RequestBody UserResult userResult){
    log.info("条件分页查询");
    return Result.success(userService.getUserList(userResult));
}
/**
 * id查询
 */
@GetMapping("/{id}")
public Result getUser(@PathVariable Integer id){
    log.info("回显{}",id);
    return  Result.success(userService.getUser(id));
}


}
