package com.yxl.service;

import com.yxl.pojo.User;

import java.util.List;

public interface UserService {
    int getUserAll();

    List<User> getUser5(Integer number);
}
