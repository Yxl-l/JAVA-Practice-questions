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

import java.time.LocalDate;
import java.time.LocalDateTime;
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
     * 新增
     * @param emp
     * 员工对象
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
            if(!CollectionUtils.isEmpty(exprList)){
                exprList.forEach(empExpr -> empExpr.setEmpId(empId));
                empExprMapper.insertBatch(exprList);

        }
        } finally {
            EmpLog empLog = new EmpLog(null,LocalDateTime.now(),emp.toString());
            empLogService.insertLog(empLog);
        }
    }

    /**
     * 条件分页查询
     * @param empQueryParam
     * 条件分页参数对象
     * @return
     * 查询到的数组
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
