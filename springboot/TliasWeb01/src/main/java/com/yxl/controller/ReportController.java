package com.yxl.controller;
import com.yxl.pojo.Result;
import com.yxl.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/report")
@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;
    /**
     * 学员学历统计
     */
    @GetMapping("/studentDegreeData")
    public Result getStudentDegreeData(){
        log.info("统计学员的学历信息");
        return Result.success(reportService.getStudentDegreeData());
    }
    /**
     * 统计每一个班级的人数
     */
    @GetMapping("/studentCountData")
    public Result getStudentCountData(){
        log.info("统计每一个班级的人数");
        return Result.success(reportService.getStudentCountData());
    }

    /**
     * 统计各个职位的员工人数
     */
    @GetMapping("/empJobData")
    public Result getEmpJobData(){
        log.info("统计各个职位的员工人数");
        return Result.success(reportService.getEmpJobData());
    }
    /**
     * 统计职员性别人数
     */
    @GetMapping("/empGenderData")
    public Result getEmpGenderData(){
        log.info("统计职员性别人数");
        return Result.success(reportService.getEmpGenderData());
    }

}