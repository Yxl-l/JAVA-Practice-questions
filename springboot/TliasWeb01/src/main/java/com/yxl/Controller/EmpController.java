//package com.yxl.Controller;
//
//import com.yxl.pojo.PageResult;
//import com.yxl.service.EmpService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.yxl.pojo.Result;
//
//@Slf4j
//@RequestMapping("/emps")
//@RestController
//public class EmpController {
//    @Autowired
//    private EmpService empService;
//
//    @GetMapping
//    public Result getEmp(@RequestParam(defaultValue = "1") Integer page,
//                         @RequestParam(defaultValue = "10")Integer pageSize){
//        log.info("查询员工信息, page={}, pageSize={}", page, pageSize);
//
//       PageResult pageResult= empService.getEmp(page,pageSize);
//        return Result.success(pageResult);
//
//    }
//
//}
