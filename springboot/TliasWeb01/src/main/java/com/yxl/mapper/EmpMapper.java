package com.yxl.mapper;

import com.yxl.pojo.Emp;
import com.yxl.pojo.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    /**
     * 查询所有的员工及其对应的部门名称
     */
    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id")
    public List<Emp> list();

//    @Select("select count(*) from emp left join dept on emp.dept_id = dept.id")
//    Integer countEmp();
//@Select("select * from emp left join dept on emp.dept_id = dept.id limit #{index},#{pageSize}")
//    List<Emp> getEmp(Integer index, Integer pageSize);
}
