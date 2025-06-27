package com.yxl.mapper;

import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.PageResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {



    /**
     * 新增员工数据
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) " +
            "value (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void postEmp(Emp emp);

    /**
     * 查询所有的员工及其对应的部门名称
     */

    public List<Emp> list(EmpQueryParam empQueryParam);

    List<Emp> getEmpList();

}
