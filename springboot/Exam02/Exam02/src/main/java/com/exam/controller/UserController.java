package com.exam.controller;

import com.exam.pojo.LoginInfo;
import com.exam.pojo.Result;
import com.exam.pojo.Role;
import com.exam.pojo.User;
import com.exam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
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
    return Result.success("用户"+loginInfo.getName()+"登陆成功"+"可访问权限为"+loginInfo.getPermissions()+"登录令牌："+loginInfo.getToken());
    }
    log.info("登录失败");
    return Result.error("登陆失败请核对用户名密码");
}
/**
 * 新增用户
 */
@PostMapping("/add")
    public Result postUser(@RequestBody User user){
    log.info("添加用户{}",user);
    userService.postUser(user);
    return Result.success("添加成功");
}
/**
 * 给角色授予权限
 */
@PostMapping("/add/rp")
    public Result postRolePermission(@RequestBody Role role){
    log.info("给角色授予权限{}",role);
    userService.postRolePermission(role);
    return Result.success("添加成功");
}
/**
 *  取消角色权限
 */
@DeleteMapping("/del/rp")
    public Result deleteRolePermission(@RequestBody Role role){
    log.info("取消角色权限{}",role);
    userService.deleteRolePermission(role);
    return Result.success("取消成功");
}
/**
 * 查询用户权限
 */
@GetMapping("/p")
    public Result getPermission(Integer userId){
    log.info("查询用户权限{}",userId);
    return Result.success(userService.getPermission(userId));
}
    /**
     * 修改用户角色
     */
    @PutMapping("/update")
    public Result putUserRole(@RequestBody User user){
        log.info("修改用户权限{}",user);
        userService.putUserRole(user);
        return Result.success("修改成功");
    }
    /**
     * 查询用户信息
     */
//    @GetMapping("/xx")
//    public Result getUser(Integer userId){
//        log.info("查询用户信息{}",userId);
//        return Result.success(userService.getUser(userId));
//    }


}
