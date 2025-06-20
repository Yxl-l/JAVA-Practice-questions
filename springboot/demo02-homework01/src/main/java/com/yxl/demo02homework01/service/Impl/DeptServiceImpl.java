package com.yxl.demo02homework01.service.Impl;

import com.yxl.demo02homework01.dao.Impl.DeptDaoImpl;
import com.yxl.demo02homework01.pojo.Dept;
import com.yxl.demo02homework01.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDaoImpl DeptDaoImpl;
    @Override
    public List<Dept> DeptServiceDept() {
        return DeptDaoImpl.DeptDaoDept().stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String name = parts[1];
            LocalDateTime updateTime = LocalDateTime.parse(parts[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new Dept(id, name, updateTime);
        }).toList();
    }
}
