package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;

public interface ClazzService extends IService<Clazz> {

    PageResult<Clazz> getPage(EmpQueryParam empQueryParam);
}
