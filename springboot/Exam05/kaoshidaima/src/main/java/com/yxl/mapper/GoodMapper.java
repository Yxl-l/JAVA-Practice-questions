package com.yxl.mapper;

import com.yxl.pojo.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodMapper {
    @Select("select * from tb_category order by sort")
    List<Good> getAll();
}
