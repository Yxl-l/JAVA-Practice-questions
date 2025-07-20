package com.yxl.controller;

import com.yxl.pojo.Result;
import com.yxl.service.CartInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping
@RestController
@RequiredArgsConstructor
public class CartInfoController {
    /***
     * 获取所有购物车数据
     */
    private final CartInfoService cartInfoService;
    @GetMapping("/cart")
    public Result CartInfo(){
        log.info("获取购物车");
        return Result.success(cartInfoService.CartInfo());
    }

}
