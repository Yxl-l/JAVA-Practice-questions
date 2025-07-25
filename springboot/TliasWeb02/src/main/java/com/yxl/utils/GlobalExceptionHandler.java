package com.yxl.utils;

import com.yxl.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Result ex(Exception e){
        e.printStackTrace();
        log.info("出现异常");
        return Result.error("出现异常啊啊啊啊");
    }
}
