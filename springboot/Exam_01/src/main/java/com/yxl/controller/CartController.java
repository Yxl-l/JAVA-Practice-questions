package com.yxl.controller;

import com.yxl.pojo.CartInfo;
import com.yxl.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    /***
     * 获取所有购物车数据
     */
    @GetMapping
    public List<CartInfo> list(){
        return cartService.list();
    }
}
