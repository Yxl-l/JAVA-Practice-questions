package com.yxl.mapper;

import com.yxl.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Select("select * from tb_category order by sort")
    List<Category> list();

    //查询所有数据

}
