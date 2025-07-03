package com.yxl.mapper;

import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.PageResult;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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
     * 条件分页查询
     */
     List<Emp> list(EmpQueryParam empQueryParam);
    /**
     *查询所有员工
     */
    List<Emp> getEmpList();
    /**
     * 批量删除
     */
    void deleteEmp(List<Integer> ids);
    /**
     * 根据id查询
     */
    Emp getEmpId(Integer id);
    /**
     * 修改员工信息
     */
    void putEmp(Emp emp);

    /**
     * 各部门员工数量统计
     */
    @MapKey("pos")
    List<Map<String, Object>> getEmpJobData();
    /**
     * 员工性别统计
     */
    @MapKey("name")
    List<Map<String, Object>> getEmpGenderData();

    Emp getUsernameAndPassword(Emp emp);
}
