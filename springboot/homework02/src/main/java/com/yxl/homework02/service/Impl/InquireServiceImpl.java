package com.yxl.homework02.service.Impl;

import com.yxl.homework02.dao.Impl.InquireDaoImpl;
import com.yxl.homework02.entity.People;
import com.yxl.homework02.service.InquireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * 查询
 */
import java.util.List;
@Repository
public class InquireServiceImpl implements InquireService {
    @Autowired
    private InquireDaoImpl inquireDaoImpl;
    @Override
    public List<People> inquire(String name, Integer gender, Integer job) {
        return inquireDaoImpl.inquire(name, gender, job);

    }
}
