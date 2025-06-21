package com.yxl.homework02.dao.Impl;

import com.yxl.homework02.dao.DeleteDaoI;
import org.springframework.stereotype.Repository;

/**
 * 删除
 */
@Repository
public class DeleteDaoImpl implements DeleteDaoI {
    @Override
    public void delete(int id) {
        ListAllDaoImpl.peopleList.removeIf(people -> people.getId()==id);

    }
}
