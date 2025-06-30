package com.yxl.service;

import com.yxl.pojo.JobOption;
import com.yxl.pojo.StudentOption;

import java.util.List;
import java.util.Map;

public interface ReportService {
    JobOption getEmpJobData();

    List<Map<String,Object>> getEmpGenderData();

    StudentOption getStudentCountData();

    List<Map<String,Object>> getStudentDegreeData();
}
