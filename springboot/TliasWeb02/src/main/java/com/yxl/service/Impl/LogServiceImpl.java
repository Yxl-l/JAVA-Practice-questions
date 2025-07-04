package com.yxl.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxl.mapper.OperateLogMapper;
import com.yxl.pojo.OperateLog;
import com.yxl.pojo.PageResult;
import com.yxl.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private OperateLogMapper operateLogMapper;
    @Override
    public PageResult getLog(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<OperateLog> list = operateLogMapper.getLog();
        Page<OperateLog> pageList = (Page<OperateLog>) list;

        return new PageResult(pageList.getTotal(),pageList.getResult());
    }
}
