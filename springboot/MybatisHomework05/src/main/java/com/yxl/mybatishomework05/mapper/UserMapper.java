package com.yxl.mybatishomework05.mapper;

import com.yxl.mybatishomework05.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user ")
    List<User> userSelect();
}
