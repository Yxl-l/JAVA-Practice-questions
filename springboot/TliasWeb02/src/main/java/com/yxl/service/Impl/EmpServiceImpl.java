package com.yxl.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxl.mapper.EmpExprMapper;
import com.yxl.mapper.EmpMapper;
import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpExpr;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.PageResult;
import com.yxl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private  EmpExprMapper empExprMapper;

    @Override
    public void postEmp(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.postEmp(emp);

        Integer empId = emp.getId();
        List<EmpExpr> list = emp.getExprList();
        if (!CollectionUtils.isEmpty(list)){
            list.forEach(empExpr -> empExpr.setEmpId(empId));
        }
        empExprMapper.expr(list);
    }

    @Override
    public PageResult getEmp(EmpQueryParam empQueryParam) {
        PageHelper.startPage(empQueryParam.getPage(),empQueryParam.getPageSize());
        List<Emp> empList = empMapper.list(empQueryParam);
        Page<Emp> p = (Page<Emp>) empList;
        return new PageResult(p.getTotal(), p.getResult());
    }




}
