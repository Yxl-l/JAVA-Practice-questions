package com.exam.service;

import com.exam.pojo.LoginInfo;
import com.exam.pojo.PageResult;
import com.exam.pojo.User;

import java.util.List;

public interface UserService {
    PageResult getUserList(Integer page, Integer pageSize);

    User getUser(Integer id);

    LoginInfo login(User user);
}
