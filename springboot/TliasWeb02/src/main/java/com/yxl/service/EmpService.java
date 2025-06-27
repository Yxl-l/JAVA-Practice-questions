package com.yxl.service;

import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.PageResult;

public interface EmpService {


    PageResult getEmp(EmpQueryParam empQueryParam);

    void postEmp(Emp emp);
}
