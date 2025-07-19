package com.exam.service;

import com.exam.pojo.LoginInfo;
import com.exam.pojo.PageResult;
import com.exam.pojo.User;
import com.exam.pojo.UserResult;

import java.util.List;

public interface UserService {
    PageResult getUserList(UserResult userResult);

    User getUser(Integer id);

    LoginInfo login(User user);
}
