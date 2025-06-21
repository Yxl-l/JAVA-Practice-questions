package com.yxl.homework02.dao.Impl;

import com.yxl.homework02.dao.AddListDao;
import com.yxl.homework02.entity.People;
import org.springframework.stereotype.Repository;

/**
 * 添加
 */
@Repository
public class AddListDaoImpl implements AddListDao {
    @Override
    public void addList(People people) {
        ListAllDaoImpl.peopleList.add(people);
    }
}
