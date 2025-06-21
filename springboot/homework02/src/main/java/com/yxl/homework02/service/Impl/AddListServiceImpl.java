package com.yxl.homework02.service.Impl;

import com.yxl.homework02.dao.AddListDao;
import com.yxl.homework02.dao.Impl.AddListDaoImpl;
import com.yxl.homework02.entity.People;
import com.yxl.homework02.service.AddListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
/**
 * 添加
 */
@Service
public class AddListServiceImpl implements AddListService{
    @Autowired
    private AddListDaoImpl addListDaoImpl;
    @Override
    public void addList(int id, String name, String image, Integer gender, Integer job) {
        addListDaoImpl.addList( new People(id, name,gender, image, job, LocalDateTime.now()));
    }

}
