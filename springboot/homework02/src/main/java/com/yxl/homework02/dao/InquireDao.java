package com.yxl.homework02.dao;

import com.yxl.homework02.entity.People;

import java.util.List;

public interface InquireDao {
    public List<People> inquire(String name, Integer gender, Integer job);
}
