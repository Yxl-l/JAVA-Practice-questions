package com.yxl.mybatisDemo02.mapper;

import com.yxl.mybatisDemo02.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    //xml查询全部
    List<User>selectUser();
    //xml添加
    int insertUser();
    //xml删除
    int deleteUser(Integer id);
    //xml修改
   int  updateUser(User user);
   //指定查询
   int selectUserqqq(@Param("username") String username, @Param("password") String password);
    /**
     * 查询全部
     */
    @Select("select * from user ")
     List<User> findAll();

    @Delete("delete from user where id = #{id}")
   int deleteById(Integer id);


    @Insert("insert into user(username,password,name,age) values(#{username},#{password},#{name},#{age})")
     int insert(User user);
    /**
     * 根据id更新用户信息
     */
    @Update("update user set username = #{username},password = #{password},name = #{name},age = #{age} where id = #{id}")
    public void update(User user);

    /**
     * 根据用户名和密码查询用户信息
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
