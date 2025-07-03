package com.yxl.mapper;

import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmpMapper {

    /**
     * 条件分页查询
     */
    List<Emp> list(EmpQueryParam empQueryParam);
    /**
     * 新增员工
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) " +
            "value (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void postEmp(Emp emp);
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
     * 员工信息统计
     */
    @MapKey("pos")
    List<Map<String,Object>> getEmpJobData();

    Emp getUsernameAndPassword(Emp emp);
}
