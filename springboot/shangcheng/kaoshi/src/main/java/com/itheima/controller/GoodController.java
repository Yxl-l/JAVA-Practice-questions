package com.itheima.controller;


import com.itheima.pojo.Good;
import com.itheima.service.GoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/good")
@RequiredArgsConstructor
public class GoodController {

    private final GoodService goodService;

    @GetMapping
    public List<Good> getAll(){
        return goodService.getAll();
    }

}
