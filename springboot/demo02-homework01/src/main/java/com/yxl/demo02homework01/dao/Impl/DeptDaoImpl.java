package com.yxl.demo02homework01.dao.Impl;

import cn.hutool.core.io.IoUtil;
import com.yxl.demo02homework01.dao.DeptDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@Repository
public class DeptDaoImpl implements DeptDao {
    @Override
    public List<String> DeptDaoDept() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        return IoUtil.readUtf8Lines(in, new ArrayList<String>());

    }
}
