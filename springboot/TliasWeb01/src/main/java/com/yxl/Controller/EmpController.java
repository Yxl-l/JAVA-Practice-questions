package com.yxl.Controller;
import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.PageResult;
import com.yxl.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yxl.pojo.Result;

import java.util.List;

@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    /**
     * 回显员工信息，工作履历
     */
    @GetMapping("/{id}")
    public Result getEmpId(@PathVariable Integer id){
        log.info("回显{}",id);
        return  Result.success(empService.getEmpId(id));
    }
    /**
     * 修改员工
     */
    @PutMapping
    public Result putEmp(@RequestBody Emp emp){
        log.info("修改员工信息");
        empService.putEmp(emp);
        return Result.success("修改成功");
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
     * 查询所有员工
     */
    @GetMapping("/list")
    public Result gatEmpList(){
        log.info("查询所有");
        return Result.success(empService.getEmpList());
    }



/**
 *  条件分页查询
 */
    @GetMapping
    public Result getEmp(EmpQueryParam empQueryParam){
        log.info("查询请求参数： {}", empQueryParam);
        return Result.success(empService.getEmp(empQueryParam));

    }

    /**
     *新增
     */
    @PostMapping
    public Result postEmp(@RequestBody Emp emp){
        log.info("请求参数emp: {}", emp);
        empService.postEmp(emp);
        return Result.success("新增成功");
    }

}
