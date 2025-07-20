package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;

import java.util.List;

public interface EmpService extends IService<Emp> {

    void saveEmp(Emp emp);

    PageResult<Emp> pageInfo(EmpQueryParam param);

    void deleteEmps(List<Integer> ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);
}
