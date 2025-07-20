package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.EmpExprMapper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpExpr;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

    @Autowired
    private EmpExprMapper empExprMapper;

    @Override
    public void saveEmp(Emp emp) {
        // 新增员工
        emp.setUpdateTime(LocalDateTime.now());
        emp.setCreateTime(LocalDateTime.now());
        getBaseMapper().insert(emp);

        //新增员工经历
        if (!CollectionUtils.isEmpty(emp.getExprList())){
            emp.getExprList().forEach(expr -> expr.setEmpId(emp.getId()));
            empExprMapper.insertBatch(emp.getExprList());
        }
    }

    @Override
    public PageResult<Emp> pageInfo(EmpQueryParam param) {
        PageHelper.startPage(param.getPage(), param.getPageSize());
        Page<Emp> list = (Page<Emp>) getBaseMapper().pageInfo(param);
        PageResult<Emp> pageResult = new PageResult<>(list.getTotal(),list.getResult());
        return pageResult;
    }

    @Override
    public void deleteEmps(List<Integer> ids) {
        getBaseMapper().deleteByIds(ids);
        empExprMapper.deleteByIds(ids);
    }

    @Override
    public Emp getEmpById(Integer id) {
        Emp emp = getBaseMapper().getInfo(id);
        return emp;
    }

    @Override
    public void updateEmp(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        getBaseMapper().updateById(emp);
        empExprMapper.deleteAll(Arrays.asList(emp.getId()));
        List<EmpExpr> exprList = emp.getExprList();
        if (!CollectionUtils.isEmpty(exprList)){
            exprList.forEach(expr->expr.setEmpId(emp.getId()));
            empExprMapper.insertBatch(exprList);
        }
    }
}
