package com.yxl.mapper;

import com.yxl.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept")
    List<Dept> getDept();

    @Delete("delete from dept where id = #{id}")
    Integer delete(Integer id);

    @Insert("insert into dept(name,create_time,update_time) value(#{name},#{createTime},#{updateTime}) ")
    void postDept(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept getDeptById(Integer id);

    @Update("update dept set name=#{name},update_time = #{updateTime} where id=#{id} ")
    void putDept(Dept dept);

    //查询部门下是否有员工
    @Select("select count(*) from emp where dept_id = #{id}")
    int deptEmpCount(Integer id);
}
