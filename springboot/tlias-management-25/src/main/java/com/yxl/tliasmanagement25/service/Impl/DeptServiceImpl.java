package com.yxl.tliasmanagement25.service.Impl;

import com.yxl.tliasmanagement25.mapper.DeptMapper;
import com.yxl.tliasmanagement25.pojo.Dept;
import com.yxl.tliasmanagement25.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Override
    public Dept putDept(Integer id) {
        return deptMapper.putDept(id);
    }

    @Override
    public void putDept1(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.putDept1(dept);
    }

    @Override
    public void deleteDept(Integer id) {
        deptMapper.deleteDept(id);

    }

    @Autowired
private DeptMapper deptMapper;
    @Override
    public void postDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.postDept(dept);
    }
}
