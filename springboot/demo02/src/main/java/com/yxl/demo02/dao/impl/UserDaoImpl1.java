package com.yxl.demo02.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.yxl.demo02.dao.UserDao1;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl1 implements UserDao1 {
    @Override
    public List<String> findAll() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        return IoUtil.readLines(is, StandardCharsets.UTF_8,new ArrayList<>());
    }
}
