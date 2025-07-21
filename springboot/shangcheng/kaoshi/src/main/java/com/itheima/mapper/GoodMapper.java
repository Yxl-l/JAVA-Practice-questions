package com.itheima.mapper;


import com.itheima.pojo.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodMapper {

    @Select("select * from good")
    List<Good> getAll();
}
