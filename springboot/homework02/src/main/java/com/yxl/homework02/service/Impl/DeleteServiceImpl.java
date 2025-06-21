package com.yxl.homework02.service.Impl;

import com.yxl.homework02.dao.Impl.DeleteDaoImpl;
import com.yxl.homework02.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 删除
 */
@Service
public class DeleteServiceImpl implements DeleteService {
    @Autowired
    private DeleteDaoImpl deleteDaoImpl;
    @Override
    public String delete(int id) {
        deleteDaoImpl.delete(id);
            return "删除成功";

    }
}
