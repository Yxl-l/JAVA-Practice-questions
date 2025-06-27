package com.yxl.service.Impl;

import com.yxl.mapper.EmpLogMapper;
import com.yxl.pojo.EmpLog;
import com.yxl.service.EmpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
//Propagation.REQUIRES_NEW  ：不论是否有事务，都创建新事务  ，运行在一个独立的事务中。默认加入调用方事务
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class EmpLogServiceImpl implements EmpLogService {
    @Autowired
    private EmpLogMapper empLogMapper;
    @Override
    public void insertLog(EmpLog empLog) {

            empLogMapper.insert(empLog);
        }
    }

