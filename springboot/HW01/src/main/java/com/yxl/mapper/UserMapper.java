package com.yxl.mapper;

import com.yxl.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select count(*) from user")
    int getUserAll();

    @Select("select * from user limit #{a},5 ")
    List<User> getUser5(Integer a);
}
