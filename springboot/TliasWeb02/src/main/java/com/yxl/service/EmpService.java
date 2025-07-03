package com.yxl.service;

import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.LoginInfo;
import com.yxl.pojo.PageResult;

import java.util.List;

public interface EmpService {


    PageResult getEmp(EmpQueryParam empQueryParam);

    void postEmp(Emp emp);


    void delete(List<Integer> ids);

    Emp getEmpId(Integer id);

    void putEmp(Emp emp);


    LoginInfo login(Emp emp);
}
