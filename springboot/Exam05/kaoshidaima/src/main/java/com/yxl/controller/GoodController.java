package com.yxl.controller;


import com.yxl.pojo.Good;
import com.yxl.service.GoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/good")
@RequiredArgsConstructor
public class GoodController {
    /***
     * 递归查询所有分类数据
     */
    private final GoodService goodService;

    @GetMapping

    public List<Good> getAll(){
        log.info("递归查询所有分类数据");
        return goodService.getAll();
    }

}
