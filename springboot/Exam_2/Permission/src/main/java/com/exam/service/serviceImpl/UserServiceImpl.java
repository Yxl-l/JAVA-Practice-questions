package com.exam.service.serviceImpl;

import com.exam.mapper.UserMapper;
import com.exam.pojo.User;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 新增用户
     */

    @Override
    public void postUser(User user) {
        userMapper.postUser(user);//新增用户基础信息

        userMapper.userRole(user);//新增用户的角色信息
    }
}
