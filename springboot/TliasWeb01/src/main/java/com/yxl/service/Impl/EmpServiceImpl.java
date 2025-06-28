package com.yxl.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxl.mapper.EmpExprMapper;
import com.yxl.mapper.EmpMapper;
import com.yxl.pojo.*;

import com.yxl.service.EmpLogService;
import com.yxl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;
    @Autowired
    private EmpLogService empLogService;
    /**
     * 修改员工信息和履历
     */
    @Override
    public void putEmp(Emp emp) {
        //修改信息
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.putEmp(emp);
        //删除全部履历
        empExprMapper.deleteEmpExpr(Arrays.asList(emp.getId()));//删除方法里参数是id集合要把emp.getId()转为list集合
        //添加履历
        Integer empId = emp.getId();//emp对象本来就有id不用和添加一样去获取
        List<EmpExpr> exprList = emp.getExprList();
        if (!CollectionUtils.isEmpty(exprList)) {
            exprList.forEach(empExpr -> empExpr.setEmpId(empId));
            empExprMapper.insertBatch(exprList);

        }
    }
    /**
     * 回显员工信息，工作履历
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
        empMapper.deleteEmp(ids);
        empExprMapper.deleteEmpExpr(ids);
    }

    /**
     * 查询所有员工
     */
    @Override
    public List<Emp> getEmpList() {
        return empMapper.getEmpList();
    }

    /**
     * 新增
     *
     */
    @Transactional(rollbackFor = {Exception.class})
    //默认出现运行异常才回滚，加(rollbackFor = {Exception.class})后所有异常都回滚
    @Override
    public void postEmp(Emp emp) {
        try {
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());
            empMapper.postEmp(emp);
//            int a = 1/0;

            Integer empId = emp.getId();
            List<EmpExpr> exprList = emp.getExprList();
            if (!CollectionUtils.isEmpty(exprList)) {
                exprList.forEach(empExpr -> empExpr.setEmpId(empId));
                empExprMapper.insertBatch(exprList);

            }
        } finally {
            EmpLog empLog = new EmpLog(null, LocalDateTime.now(), emp.toString());
            empLogService.insertLog(empLog);
        }
    }

    /**
     * 条件分页查询
     *
     * @param empQueryParam 条件分页参数对象
     * @return 查询到的数组
     */
    @Override
    public PageResult getEmp(EmpQueryParam empQueryParam) {
//        //获取全部数据条数
//        long count = empMapper.countEmp();
//        //起始索引
//        Integer index = (page-1)*pageSize;
//        List <Emp> list = empMapper.getEmp(index,pageSize);
//        return new PageResult(count,list);
        //1. 设置分页参数
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());

        //2. 执行查询
        List<Emp> empList = empMapper.list(empQueryParam);
        Page<Emp> p = (Page<Emp>) empList;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }
}
