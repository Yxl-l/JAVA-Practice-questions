package com.yxl.utils;

import com.yxl.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/*****类上添加注解@RestControllerAdvice
 * 1）会将该注解所在的类交给Spring的Ioc容器管理
 * 2）该注解所在的类的方法响应数据格式是JSON格式
 * 3）加该注解的类，会拦截所有ControLLer层方法的异常（方法上有@GetMapping、@PostMapping、@XxxMapping）
 * 4）该类拦截后，会将异常交给带有@ExceptionHandLer注解的方法处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(value = {NoClassDefFoundError.class})  可以指定方法要处理的异常类型
    @ExceptionHandler
    public Result ex(Exception e){
        e.printStackTrace();
        log.info("程序异常",e);
        return Result.error("对不起,操作失败,请联系管理员");
    }
}
