package com.yxl.service.Impl;

import com.yxl.mapper.EmpMapper;
import com.yxl.pojo.JobOption;
import com.yxl.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public JobOption getEmpJobData() {
        List<Map<String,Object>> list = empMapper.getEmpJobData();
        List<Object> jobList = list.stream().map(m->m.get("pos")).toList();
        List<Object> dataList = list.stream().map(m->m.get("total")).toList();
        return new JobOption(jobList,dataList);
    }
}
