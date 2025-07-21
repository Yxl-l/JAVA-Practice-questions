package com.yxl.service;

import com.yxl.pojo.LoginInfo;
import com.yxl.pojo.User;

public interface UserService {
    LoginInfo login(User user);
}
