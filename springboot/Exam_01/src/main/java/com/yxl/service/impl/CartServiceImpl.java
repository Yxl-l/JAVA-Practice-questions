package com.yxl.service.impl;
import com.yxl.mapper.CartMapper;
import com.yxl.pojo.CartInfo;
import com.yxl.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<CartInfo> list() {
        return cartMapper.list();
    }
}
