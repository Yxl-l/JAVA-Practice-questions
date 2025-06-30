package com.yxl.controller;
import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.Result;
import com.yxl.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/emps")
@RestController
@Slf4j
public class EmpController {
    @Autowired
    private EmpService empService;
    /**
    * 修改员工数据
    */
    @PutMapping
    public Result putEmp(@RequestBody Emp emp){
        log.info("修改{}", emp);
        empService.putEmp(emp);

        return Result.success("修改成功");
    }


    /**
     * 回显员工数据
     */
    @GetMapping("/{id}")
    public Result getEmpId(@PathVariable Integer id) {
        log.info("回显{}", id);
        return Result.success(empService.getEmpId(id));
    }

    /**
     * 批量删除员工
     */
    @DeleteMapping
    public Result deleteEmp(@RequestParam List<Integer> ids){
        log.info("删除员工{}",ids);
        empService.delete(ids);
        return Result.success("删除成功");
    }

    /**
     * 条件分页查询
     */
    @GetMapping
    public Result getEmp(EmpQueryParam empQueryParam) {
        log.info("条件分页查询");
        return Result.success(empService.getEmp(empQueryParam));

    }

    /**
     * 新增员工
     */
    @PostMapping
    public Result postEmp(@RequestBody Emp emp) {
        log.info("请求参数emp: {}", emp);
        empService.postEmp(emp);
        return Result.success("新增成功");
    }


}
