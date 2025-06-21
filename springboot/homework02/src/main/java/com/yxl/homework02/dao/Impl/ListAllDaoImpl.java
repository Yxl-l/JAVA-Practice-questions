package com.yxl.homework02.dao.Impl;

import com.yxl.homework02.dao.ListDao;
import com.yxl.homework02.entity.People;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 全部
 */
@Repository
public class ListAllDaoImpl implements ListDao {
    public static List<People> peopleList = new ArrayList<>();
    static {
        peopleList.add(new People(1, "蔡徐坤",1, "https://img0.baidu.com/it/u=1844111227,3488174992&fm=253&fmt=auto&app=120&f=JPEG?w=500&h=500", 2, LocalDateTime.now()));
        peopleList.add(new People(2, "鸡哥🏀",1, "https://img0.baidu.com/it/u=2496610430,316999243&fm=253&fmt=auto&app=138&f=JPEG?w=199&h=197",3,LocalDateTime.now()));

    }
    @Override
    public List<People> listAll() {
        return peopleList;
    }
}
