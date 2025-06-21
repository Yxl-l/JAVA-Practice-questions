package com.yxl.homework02.service;

import com.yxl.homework02.entity.People;

import java.util.List;

public interface InquireService {
    public List<People> inquire(String name, Integer gender, Integer job);
}
