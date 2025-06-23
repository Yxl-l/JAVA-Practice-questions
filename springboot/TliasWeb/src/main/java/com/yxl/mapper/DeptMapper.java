package com.yxl.mapper;

import com.yxl.pojo.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dept")
    List<Dept> selectAllMapper();

    /**
     * 根据id删除部门
     */
    @Delete("delete from dept where id = #{id}")
    int deleteById(Integer id);

    @Insert("insert into dept(name,create_time,update_time) value (#{name},#{createTime},#{updateTime})")
    int postById(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept getDeptById(Integer id);
@Update("update dept set name = #{name},update_time = #{updateTime} where id = #{id}")
    int putDept(Dept dept);
}