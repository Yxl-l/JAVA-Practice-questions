package com.yxl.Controller;

import com.yxl.pojo.Dept;
import com.yxl.pojo.Result;
import com.yxl.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
@Autowired private DeptService deptService;

    /**
     * 查询全部
     */
    @GetMapping
    public Result getDept(){
        log.info("查询全部信息");
        return Result.success(deptService.getDept());
    }
    /**
     * 根据id删除
     */
    @DeleteMapping
    public Result deleteDept(Integer id){
        log.info("删除id为{}的信息",id);
        deptService.deleteDept(id);
        return Result.success("删除成功");
    }
    /**
     * 增加部门
     */
    @PostMapping
    public Result postDept(@RequestBody Dept dept){
        log.info("添加部门{}",dept);
        deptService.postDept(dept);
        return Result.success("添加成功");
    }
    /**
     * id查询
     */
    @GetMapping("/{id}")
    public Result getDeptById(@PathVariable Integer id){
        log.info("查询id为{}的数据",id);
        return Result.success(deptService.getDeptById(id));
    }
    /**
     * 修改
     */
    @PutMapping
    public Result putDept(@RequestBody Dept dept){
        log.info("修改资料成功");
        deptService.putDept(dept);
        return Result.success("修改成功");
    }
}
