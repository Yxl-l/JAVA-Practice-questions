package com.yxl.aop;

import com.yxl.mapper.LoginMapper;
import com.yxl.pojo.EmpLogin;
import com.yxl.utils.CurrentHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.security.auth.callback.CallbackHandler;

@Component
@Slf4j
@Aspect
public class LoginAspect {
    @Autowired
    private LoginMapper loginMapper;

    @Around("execution(* com.yxl.controller.UserLonginController.login(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        try {
            long start = System.currentTimeMillis();
            Object result = pjp.proceed();
            long end = System.currentTimeMillis();
            EmpLogin empLogin = CurrentHolder.getEmpLogin();
            empLogin.setCostTime(end-start);
            log.info("登录耗时{}毫秒",end-start);
            loginMapper.insert(empLogin);
            return result;
        } finally {
            CurrentHolder.removeEmpLogin();//清理线程暂存的登录信息
        }
    }
}
