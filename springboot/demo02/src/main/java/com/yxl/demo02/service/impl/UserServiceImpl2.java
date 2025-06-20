package com.yxl.demo02.service.impl;

import com.yxl.demo02.dao.UserDao2;
import com.yxl.demo02.dao.impl.UserDaoImpl2;
import com.yxl.demo02.pojo.User;
import com.yxl.demo02.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl2 implements UserService2 {
    @Autowired
    private UserDaoImpl2 userDaoImpl2;
    @Override
    public List<User> UserService2User() {


        return userDaoImpl2.UserDao2User().stream().map(
                p -> {
                    String[] s = p.split(",");
                    User user = new User();
                    user.setId(Integer.parseInt(s[0]));
                    user.setUsername(s[1]);
                    user.setPassword(s[2]);
                    user.setName(s[3]);
                    user.setAge(Integer.parseInt(s[4]));
                    LocalDateTime localDateTime = LocalDateTime.parse(s[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    return user;
                }).collect(Collectors.toList());
    }
}
