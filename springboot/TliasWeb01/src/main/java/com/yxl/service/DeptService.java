package com.yxl.service;

import com.yxl.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getDept ();

    void deleteDept(Integer id);

    void postDept(Dept dept);

    Dept getDeptById(Integer id);

    void putDept(Dept dept);
}
