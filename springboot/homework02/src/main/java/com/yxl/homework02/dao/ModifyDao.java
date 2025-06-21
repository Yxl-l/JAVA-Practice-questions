package com.yxl.homework02.dao;

public interface ModifyDao {
    public int modify(int id,
                      String name,
                      String image,
                      Integer gender,
                      Integer job,
                      int count);
}
