package com.yxl.mapper;

import com.yxl.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept")
    List<Dept> getDept();

    @Delete("delete from dept where id = #{id}")
    void delete(Integer id);

    @Insert("insert into dept(name,create_time,update_time) value(#{name},#{createTime},#{updateTime}) ")
    void postDept(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept getDeptById(Integer id);

    @Update("update dept set name=#{name},update_time = #{updateTime} where id=#{id} ")
    void putDept(Dept dept);
}
