package com.exam.service.serviceImpl;

import com.exam.Utils.JwtUtils;
import com.exam.mapper.UserMapper;
import com.exam.pojo.LoginInfo;
import com.exam.pojo.Role;
import com.exam.pojo.User;
import com.exam.pojo.UserInformation;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    /**
     * 登录
     */
    @Override
    public LoginInfo login(User user) {
    //查询到匹配的用户名和密码返回该用户全部信息
    User userNew =  userMapper.getUsernameAndPassword(user);
    if (userNew!=null){
        //登陆成功后获取用户拥有的权限信息
        List<String> permissions = userMapper.getPermission(userNew.getUserId());
        //登录成功生成令牌给登录信息对象
            //把用户权限信息放入map集合给令牌负载 payload 中存储
                Map<String,Object> map = new HashMap<>();
                map.put("permissions",permissions);
                String token = JwtUtils.generateJwt(map);
        //生成令牌给登录信息对象
        return new LoginInfo(userNew.getUserId(),userNew.getUserName(),userNew.getName(),token,permissions);
    }
        return null;
    }
    /**
     * 修改用户角色
     */
    @Override
    public void putUserRole(User user) {
        List<Integer> roleIds = new ArrayList<>();
        user.getRole().forEach(role -> roleIds.add(role.getRoleId()));
        userMapper.deleteUserRole(user.getUserId());//先删用户全部角色
        userMapper.userRole(user.getUserId(),roleIds);//添加用户修改后的全部角色信息

    }
    /**
     * 查询用户权限
     */
    @Override
    public List<String> getPermission(Integer userId) {
        return userMapper.getPermission(userId);
    }
//    /**
//     * 查询用户信息
//     */
//    @Override
//    public UserInformation getUser(Integer userId) {
//        return null;
//    }
    /**
     * 给角色授予权限
     */
    @Override
    public void postRolePermission(Role role) {
        List<Integer> permissionIds = new ArrayList<>();
        role.getPermission().forEach(permission -> permissionIds.add(permission.getPermissionId()));
        userMapper.postRolePermission(role.getRoleId(),permissionIds);
    }
    /**
     *  取消角色权限
     */
    @Override
    public void deleteRolePermission(Role role) {
        List<Integer> permissionIds = new ArrayList<>();
        role.getPermission().forEach(permission -> permissionIds.add(permission.getPermissionId()));
        userMapper.deleteRolePermission(role.getRoleId(),permissionIds);
    }
    /**
     * 新增用户
     */

    @Override
    public void postUser(User user) {
        userMapper.postUser(user);//新增用户基础信息
        List<Integer> roleIds = new ArrayList<>();
        user.getRole().forEach(role -> roleIds.add(role.getRoleId()));
        userMapper.userRole(user.getUserId(),roleIds);//新增用户的角色信息
    }
}
