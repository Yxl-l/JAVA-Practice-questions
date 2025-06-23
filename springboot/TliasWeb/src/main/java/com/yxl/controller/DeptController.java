package com.yxl.controller;

import com.yxl.pojo.Dept;
import com.yxl.pojo.Result;
import com.yxl.service.DeptService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理控制器
 */
@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * 查询全部
     * @return
     */
    @GetMapping
    public List<Dept> getDept(){

        return deptService.deptService();
    }
/**
 * 根据id删除
 */
@DeleteMapping
    public Result deleteResult(Integer id){
    System.out.println(id);
    deptService.deleteById(id);
    return Result.success();
}
/**
 * 新增
 */
@PostMapping
    public Result postResult(@RequestBody Dept dept){
    System.out.println(dept);
    deptService.postById(dept);
    return Result.success();
}

    /**
     * 回显
     */
    @GetMapping("/{id}")
    public Result getDeptById(@PathVariable Integer id){
    System.out.println(id);
    return Result.success(deptService.getDeptById(id));
}
/**
 * 修改
 */
@PutMapping
public Result putDept(@RequestBody Dept dept){
    System.out.println(dept);
    deptService.putDept(dept);
    return Result.success();
}
}