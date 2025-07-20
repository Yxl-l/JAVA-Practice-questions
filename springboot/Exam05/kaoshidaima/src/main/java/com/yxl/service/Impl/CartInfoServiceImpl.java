package com.yxl.service.Impl;

import com.yxl.mapper.CartInfoMapper;
import com.yxl.pojo.CartInfo;
import com.yxl.service.CartInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CartInfoServiceImpl implements CartInfoService {
    private final CartInfoMapper cartInfoMapper;
    @Override
    public List<CartInfo> CartInfo() {
        return cartInfoMapper.CartInfo();


    }
}
