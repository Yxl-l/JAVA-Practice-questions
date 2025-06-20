package com.yxl.demo02.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.yxl.demo02.dao.UserDao;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public List<String> findAll() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        //1)要读取的文件的输入流
        //2)指定字符集（UTF-8）
        //3)要存数据的对象(Collection)
        ArrayList<String> list = IoUtil.readLines(is, StandardCharsets.UTF_8,new ArrayList<>());
        return list;
    }
}
