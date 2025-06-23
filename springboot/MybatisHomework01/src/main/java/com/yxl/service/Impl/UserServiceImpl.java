package com.yxl.service.Impl;

import com.yxl.mapper.UserMapper;
import com.yxl.pojo.User;
import com.yxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;
    @Override
    public User userSelect(Integer id) {
        return userMapper.userSelect(id);
    }
}
