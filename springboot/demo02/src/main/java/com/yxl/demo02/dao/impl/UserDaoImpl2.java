package com.yxl.demo02.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.yxl.demo02.dao.UserDao2;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl2 implements UserDao2 {
    @Override
    public List<String> UserDao2User() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        return   IoUtil.readLines(is, StandardCharsets.UTF_8,new ArrayList<>());

    }
}
