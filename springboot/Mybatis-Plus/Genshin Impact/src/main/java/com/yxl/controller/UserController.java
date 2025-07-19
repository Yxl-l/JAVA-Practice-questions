package com.yxl.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxl.pojo.PageResult;
import com.yxl.pojo.Result;
import com.yxl.pojo.User;
import com.yxl.pojo.UserResult;
import com.yxl.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Slf4j
@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserController {
@Autowired
    private UserService userService;
/**
 * 新增角色
 */


/**
 *
    条件分页查询
 */
@PostMapping
public Result getUserList(@RequestBody UserResult userResult){
    log.info("条件分页查询");
    //分页封装对象Page
    Page<User> page = new Page<>(userResult.getPage(),userResult.getPageSize());
    //构建条件查询
    LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();

    wrapper.like(!Objects.isNull(userResult.getName()),User::getName, userResult.getName())
            .eq(!Objects.isNull(userResult.getElement()),User::getElement, userResult.getElement())
            .eq(!Objects.isNull(userResult.getWeapon()),User::getWeapon, userResult.getWeapon());

    //、执行分页查询
    IPage<User> pageInfo =userService.page(page,wrapper);
    return Result.success(new PageResult(page.getTotal(),pageInfo.getRecords()));
}
}
