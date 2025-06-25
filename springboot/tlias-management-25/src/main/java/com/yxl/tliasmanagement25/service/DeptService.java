package com.yxl.tliasmanagement25.service;

import com.yxl.tliasmanagement25.pojo.Dept;

import java.util.List;

public interface DeptService {
    void postDept(Dept dept);

    void deleteDept(Integer id);

    Dept putDept(Integer id);

    void putDept1(Dept dept);
}
