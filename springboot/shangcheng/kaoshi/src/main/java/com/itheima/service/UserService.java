package com.itheima.service;

import com.itheima.pojo.LoginInfo;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.User;
import com.itheima.pojo.UserParam;

public interface UserService {

    PageResult page(UserParam userParam);

    LoginInfo login(User user);
}
