package com.yxl.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxl.mapper.EmpExprMapper;
import com.yxl.mapper.EmpMapper;
import com.yxl.pojo.*;
import com.yxl.service.EmpService;
import com.yxl.utils.JwtUtils;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private  EmpExprMapper empExprMapper;

    /**
     * 登录验证
     */
    @Override
    public LoginInfo login(Emp emp) {
       Emp empLogin = empMapper.getUsernameAndPassword(emp);
       if(empLogin != null){
           Map<String,Object> map = new HashMap<>();
           map.put("id",empLogin.getId());
           map.put("username",empLogin.getUsername());
           return new LoginInfo(empLogin.getId(),empLogin.getUsername(), empLogin.getName(), JwtUtils.generateJwt(map));
       }
        return null;
    }
    /**
     * 修改员工数据
     */
    @Override
    public void putEmp(Emp emp) {
        //覆盖数据
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.putEmp(emp);
        //删除履历
        List<Integer> list = Collections.singletonList(emp.getId());
        empExprMapper.deleteEmpExpr(list);
        //添加履历
        Integer empId = emp.getId();
        List<EmpExpr> expr = emp.getExprList();
        if (!CollectionUtils.isEmpty(expr)){
            expr.forEach(empExpr -> empExpr.setEmpId(empId));
        }
        empExprMapper.expr(expr);
    }


    /**
     * 回显员工数据
     */
    @Override
    public Emp getEmpId(Integer id) {
        return empMapper.getEmpId(id);
    }

    /**
     * 批量删除员工
     */
    @Override
    public void delete(List<Integer> ids) {
        //删除员工
        empMapper.deleteEmp(ids);
        //删除履历
        empExprMapper.deleteEmpExpr(ids);
    }

    /**
     * 新增员工
     */
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
    /**
     * 条件分页查询
     */
    @Override
    public PageResult getEmp(EmpQueryParam empQueryParam) {
        PageHelper.startPage(empQueryParam.getPage(),empQueryParam.getPageSize());
        List<Emp> empList = empMapper.list(empQueryParam);
        Page<Emp> p = (Page<Emp>) empList;
        return new PageResult(p.getTotal(), p.getResult());
    }




}
