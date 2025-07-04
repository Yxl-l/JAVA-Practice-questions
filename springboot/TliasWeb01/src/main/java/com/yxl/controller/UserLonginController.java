package com.yxl.controller;

import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpLogin;
import com.yxl.pojo.LoginInfo;
import com.yxl.pojo.Result;
import com.yxl.service.EmpService;
import com.yxl.utils.CurrentHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

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
        //创建登录日志对象
        EmpLogin empLogin = new EmpLogin();
        empLogin.setId(emp.getId());//id
        empLogin.setUsername(emp.getUsername());//登录用户名
        empLogin.setPassword(emp.getPassword());//登录用户密码
        empLogin.setLoginTime(LocalDateTime.now());//登录时间

        if(loginInfo != null){
            log.info("登录成功");
            empLogin.setIsSuccess((short) 1);//登录成功
            empLogin.setJwt(loginInfo.getToken());//获取令牌
            CurrentHolder.setEmpLogin(empLogin);
            return Result.success(loginInfo);
        }
        log.info("登录失败");
        empLogin.setIsSuccess((short) 0);//登录失败
        CurrentHolder.setEmpLogin(empLogin);//登录日志对象放到线程的ThreadLocal里
        return Result.error("用户名或密码错误~");
    }
}
