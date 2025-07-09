package com.exam.mapper;

import com.exam.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 新增用户基础信息
     */
    @Options(useGeneratedKeys = true,keyProperty = "userId")//获取新增用户的id赋值给用户类的userId
    @Insert("insert into user(name,user_name,pass_word) values (#{name},#{userName},#{passWord})")
    void postUser(User user);
    /**
     * 新增用户角色信息
     */
    void userRole(@Param("userId") Integer userId, @Param("roleIds") List<Integer> roleIds);

    /**
     * 给角色授予权限
     */
    void postRolePermission(@Param("roleId")Integer roleId,@Param("permissionIds") List<Integer> permissionIds);
    /**
     *  取消角色权限
     */
    void deleteRolePermission(@Param("roleId") Integer roleId, @Param("permissionIds") List<Integer> permissionIds);
    /**
     * 查询用户权限
     */
    List<String> getPermission(@Param("userId")Integer userId);
    /**
     *删除用户全部角色
     */
    void deleteUserRole(@Param("userId")Integer userId);

    /**
     *查询是否有匹配的用户名密码
     */
    User getUsernameAndPassword(User user);
//    /**
//     *用户信息
//     */
//    User getUser(Integer userId);
}
