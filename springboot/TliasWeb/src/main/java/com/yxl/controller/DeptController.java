package com.yxl.controller;
import com.yxl.pojo.Dept;
import com.yxl.pojo.Result;
import com.yxl.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 部门管理控制器
 */
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * 查询全部
     */
    @GetMapping
    public Result getDept(){
        //System.out.println("查询部门列表");
        log.info("查询部门列表");
        return Result.success(deptService.deptService());
    }
/**
 * 根据id删除
 */
@DeleteMapping
    public Result deleteResult(Integer id){
    //System.out.println("根据id删除部门, id=" + id);
    log.info("根据id删除部门, id: {}" , id);
    deptService.deleteById(id);
    return Result.success();
}
/**
 * 新增
 */
@PostMapping
    public Result postResult(@RequestBody Dept dept){
    //System.out.println("新增部门, dept=" + dept);
    log.info("新增部门, dept: {}" , dept);
    deptService.postById(dept);
    return Result.success();
}

    /**
     * 回显
     */
    @GetMapping("/{id}")
    public Result getDeptById(@PathVariable Integer id){
        //System.out.println("根据ID查询, id=" + id);
        log.info("根据ID查询, id: {}" , id);
    return Result.success(deptService.getDeptById(id));
}
/**
 * 修改
 */
@PutMapping
public Result putDept(@RequestBody Dept dept){
    //System.out.println("修改部门, dept=" + dept);
    log.info("修改部门, dept: {}" , dept);
    deptService.putDept(dept);
    return Result.success();
}
}