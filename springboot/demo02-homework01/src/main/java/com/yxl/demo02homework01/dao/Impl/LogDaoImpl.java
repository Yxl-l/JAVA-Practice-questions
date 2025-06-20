package com.yxl.demo02homework01.dao.Impl;

import cn.hutool.core.io.IoUtil;
import com.yxl.demo02homework01.dao.DeptDao;
import com.yxl.demo02homework01.dao.LogDao;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LogDaoImpl implements LogDao {
    @Override
    public List<String> LogDaoLog() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("log.txt");
        return IoUtil.readUtf8Lines(in, new ArrayList<String>());

    }
}
