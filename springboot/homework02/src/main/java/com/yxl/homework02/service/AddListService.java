package com.yxl.homework02.service;

import com.yxl.homework02.entity.People;

/**
 * 添加
 */
public interface AddListService {
    public void addList(int id,
                           String name,
                           String image,
                        Integer gender,
                        Integer job);

}
