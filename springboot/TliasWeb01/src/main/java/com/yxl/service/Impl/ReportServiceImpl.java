package com.yxl.service.Impl;

import com.yxl.mapper.EmpMapper;
import com.yxl.mapper.StudentMapper;
import com.yxl.pojo.JobOption;
import com.yxl.pojo.StudentOption;
import com.yxl.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {


    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private StudentMapper studentMapper;
    /**
     * 学员学历统计
     */
    @Override
    public List<Map<String, Object>> getStudentDegreeData() {
        return studentMapper.getStudentDegreeData();
    }

    /**
     * 统计每一个班级的人数
     */
    @Override
    public StudentOption getStudentCountData() {
        List<Object> clazzList = studentMapper.getStudentCountData().stream().map(stringObjectMap -> stringObjectMap.get("clazzType")).toList();
        List<Object> dataList = studentMapper.getStudentCountData().stream().map(stringObjectMap -> stringObjectMap.get("total")).toList();
        return new StudentOption(clazzList,dataList);
    }


    /**
     * 统计职员性别人数
     */
    @Override
    public List<Map<String,Object>>  getEmpGenderData() {

        return empMapper.getEmpGenderData();
    }
    /**
     * 统计各个职位的员工人数
     */
    @Override
    public JobOption getEmpJobData() {
        List<Map<String,Object>> list = empMapper.getEmpJobData();
        List<Object> jobList = list.stream().map(m->m.get("pos")).toList();
        List<Object> dataList = list.stream().map(m->m.get("total")).toList();
        return new JobOption(jobList,dataList);
    }
}
