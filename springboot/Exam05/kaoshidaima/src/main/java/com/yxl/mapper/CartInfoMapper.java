package com.yxl.mapper;

import com.yxl.pojo.CartInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartInfoMapper {

    List<CartInfo> CartInfo();
}
