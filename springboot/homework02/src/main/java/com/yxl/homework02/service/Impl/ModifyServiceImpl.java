package com.yxl.homework02.service.Impl;

import com.yxl.homework02.dao.Impl.ListAllDaoImpl;
import com.yxl.homework02.dao.Impl.ModifyDaoImpl;

import com.yxl.homework02.service.ModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
修改
 */
@Service
public class ModifyServiceImpl implements ModifyService {
    @Autowired
    private ModifyDaoImpl modifyDaoImpl;
    @Override
    public String modify(int id,
                       String name,
                       String image,
                         Integer gender,
                         Integer job) {
        int count=0;
        count=modifyDaoImpl.modify(id,name,image,gender,job,count);
        if (count==0){
            return "没有查询到修改失败";
        }
        else {
            return "修改成功";
        }
    }
}
