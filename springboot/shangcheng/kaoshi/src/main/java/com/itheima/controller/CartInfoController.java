package com.itheima.controller;


import com.itheima.pojo.CartInfo;
import com.itheima.service.CartInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartInfoController {

    @Autowired
    private CartInfoService cartInfoService;

    @GetMapping("/cart")
    public List<CartInfo> findAll(){

        return cartInfoService.findAll();
    }
}
