package com.yxl.tliasmanagement25.controller;

import com.yxl.tliasmanagement25.pojo.Dept;
import com.yxl.tliasmanagement25.pojo.Result;
import com.yxl.tliasmanagement25.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
@Autowired
    private DeptService deptService;
    @PostMapping
    public Result postDept(@RequestBody Dept dept){
        deptService.postDept(dept);
        log.info("添加部门");
        return Result.success("添加成功");
    }
    @DeleteMapping
    public Result deleteDept(Integer id){
        deptService.deleteDept(id);
        log.info("删除部门");
        return Result.success("删除成功");
    }
    @GetMapping("/{id}")
    public Result putDept(@PathVariable Integer id){
        log.info("查询部门{}",id);

        return Result.success(deptService.putDept(id));
    }
    @PutMapping
    public Result putDept1(@RequestBody Dept dept){
        log.info("修改部门{}",dept);
        deptService.putDept1(dept);
        return Result.success("修改成功");
    }
}

