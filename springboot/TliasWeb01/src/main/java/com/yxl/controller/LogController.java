package com.yxl.controller;

import com.yxl.pojo.Result;
import com.yxl.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/log")
@RestController
public class LogController {
    @Autowired
    private LogService logService;

    /**
     * 日志信息分页查询
     */
    @GetMapping("/page")
    public Result getLog( @RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer pageSize){
        log.info("日志信息分页查询");
        return Result.success(logService.getLog(page,pageSize));
    }
}
