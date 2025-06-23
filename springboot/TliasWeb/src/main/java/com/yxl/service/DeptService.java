package com.yxl.service;

import com.yxl.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> deptService();

    void deleteById(Integer id);

    void postById(Dept dept);

   Dept getDeptById(Integer id);

    void putDept(Dept dept);
}
