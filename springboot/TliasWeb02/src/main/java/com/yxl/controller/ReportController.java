package com.yxl.controller;
import com.yxl.mapper.EmpMapper;
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
@GetMapping("/empJobData")
    public Result getEmpJobData(){
        log.info("统计各职位员工数量");
        return  Result.success(reportService.getEmpJobData());
    }
}
