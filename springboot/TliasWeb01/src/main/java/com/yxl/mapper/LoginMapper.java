package com.yxl.mapper;

import com.yxl.pojo.EmpLogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    void insert(EmpLogin empLogin);
}
