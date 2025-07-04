package com.yxl.service;

import com.yxl.pojo.PageResult;

public interface LogService {
    PageResult getLog(Integer page, Integer pageSize);
}
