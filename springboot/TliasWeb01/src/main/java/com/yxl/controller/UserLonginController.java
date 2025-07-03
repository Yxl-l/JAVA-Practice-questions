package com.yxl.controller;

import com.yxl.pojo.Emp;
import com.yxl.pojo.LoginInfo;
import com.yxl.pojo.Result;
import com.yxl.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/login")
public class UserLonginController {
    @Autowired
    private EmpService empService;

    /**
     * 登录验证
     */
    @PostMapping
    public Result login(@RequestBody Emp emp){
        log.info("员工来登录啦 , {}", emp);
        LoginInfo loginInfo = empService.login(emp);
        if(loginInfo != null){
            return Result.success(loginInfo);
        }
        return Result.error("用户名或密码错误~");
    }
}
