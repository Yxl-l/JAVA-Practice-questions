package com.yxl.tliasmanagement25.mapper;

import com.yxl.tliasmanagement25.pojo.Dept;
import org.apache.ibatis.annotations.*;


@Mapper
public interface DeptMapper {
    @Insert("insert into dept(name,create_time,update_time) value(#{name},#{createTime},#{updateTime}) ")
    public void postDept(Dept dept);

    @Delete("delete from dept where id = #{id}")
    public void deleteDept(Integer id);

    @Select("select * from dept where id = #{id}")
    Dept putDept(Integer id);

    @Update("update dept set name=#{name},update_time = #{updateTime} where id=#{id} ")
    void putDept1(Dept dept);
}
