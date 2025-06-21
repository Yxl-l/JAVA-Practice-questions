package com.yxl.homework02.service.Impl;

import com.yxl.homework02.dao.Impl.ListAllDaoImpl;
import com.yxl.homework02.entity.People;
import com.yxl.homework02.service.ListAllService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ListAllServiceImpl implements ListAllService {
@Autowired
private ListAllDaoImpl listAllDao;
    /**
     * 全部员工
     */
@Override
    public List<People> listAll() {

        return listAllDao.listAll();
    }
}
