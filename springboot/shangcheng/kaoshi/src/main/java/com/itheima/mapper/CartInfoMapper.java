package com.itheima.mapper;

import com.itheima.pojo.CartInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartInfoMapper {

    List<CartInfo> findAll();
}
