package com.itheima.service.impl;

import com.itheima.mapper.CartInfoMapper;
import com.itheima.pojo.CartInfo;
import com.itheima.service.CartInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartInfoServiceImpl implements CartInfoService {

    @Autowired
    private CartInfoMapper cartInfoMapper;

    @Override
    public List<CartInfo> findAll() {

        return cartInfoMapper.findAll();
    }
}
