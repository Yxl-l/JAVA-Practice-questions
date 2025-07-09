package com.exam.service;

import com.exam.pojo.LoginInfo;
import com.exam.pojo.Role;
import com.exam.pojo.User;
import com.exam.pojo.UserInformation;

import java.util.List;

public interface UserService {
    /**
     * 新增用户
     */
    void postUser(User user);
    /**
     * 给角色授予权限
     */
    void postRolePermission(Role role);
    /**
     *  取消角色权限
     */
    void deleteRolePermission(Role role);
    /**
     * 查询用户权限
     */
    List<String> getPermission(Integer userId);
    /**
     * 修改用户角色
     */
    void putUserRole(User user);

    /**
     *登陆成功对象
     */
    LoginInfo login(User user);

//    /**
//     *查询用户信息
//     */
//    UserInformation getUser(Integer userId);
}
