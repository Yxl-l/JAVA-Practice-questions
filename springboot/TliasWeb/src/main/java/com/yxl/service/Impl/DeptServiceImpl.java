package com.yxl.service.Impl;

import com.yxl.mapper.DeptMapper;
import com.yxl.pojo.Dept;
import com.yxl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public void putDept(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        System.out.println(deptMapper.putDept(dept));
    }

    @Override
    public Dept getDeptById(Integer id) {
       return deptMapper.getDeptById(id);
    }


    @Override
    public List<Dept> deptService() {
        return deptMapper.selectAllMapper();
    }
    @Override
    public void deleteById(Integer id) {
        System.out.println(deptMapper.deleteById(id));
    }
    @Override
    public void postById(Dept dept){
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        System.out.println(deptMapper.postById(dept));
    }
}