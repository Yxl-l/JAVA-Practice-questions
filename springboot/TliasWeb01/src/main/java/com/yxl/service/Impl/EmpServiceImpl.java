package com.yxl.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxl.mapper.EmpMapper;
import com.yxl.pojo.PageResult;
import com.yxl.pojo.Emp;

import com.yxl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageResult getEmp(Integer page, Integer pageSize) {
//        //获取全部数据条数
//        long count = empMapper.countEmp();
//        //起始索引
//        Integer index = (page-1)*pageSize;
//        List <Emp> list = empMapper.getEmp(index,pageSize);
//        return new PageResult(count,list);
        //1. 设置分页参数
        PageHelper.startPage(page,pageSize);

        //2. 执行查询
        List<Emp> empList = empMapper.list();
        Page<Emp> p = (Page<Emp>) empList;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }
}
