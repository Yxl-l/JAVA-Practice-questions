package com.itheima.mapper;

import com.itheima.pojo.User;
import com.itheima.pojo.UserParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    Integer countAll(UserParam userParam);

    List<User> page(UserParam userParam);

    @Select("select * from user where username=#{username} and password =#{password}")
    User login(User user);
}
