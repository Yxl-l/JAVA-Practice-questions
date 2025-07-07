package com.exam.mapper;

import com.exam.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface UserMapper {
    /**
     * 新增用户基础信息
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")//获取新增用户的id
    @Insert("insert into user(user,user_name,pass_word) values (#{name},#{userName},#{passWord})")
    void postUser(User user);
    /**
     * 新增用户角色信息
     */
    void userRole(User user);
}
