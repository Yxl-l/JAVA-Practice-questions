package com.yxl.service.Impl;

import com.yxl.mapper.UserMapper;
import com.yxl.pojo.User;
import com.yxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUser5(Integer number) {
        Integer a=(number-1)*5;
        return userMapper.getUser5(a);
    }
    @Override
    public int getUserAll() {
        return userMapper.getUserAll();
    }
}
