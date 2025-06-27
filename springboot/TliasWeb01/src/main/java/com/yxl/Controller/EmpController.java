package com.yxl.Controller;
import com.yxl.pojo.Emp;
import com.yxl.pojo.EmpQueryParam;
import com.yxl.pojo.PageResult;
import com.yxl.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yxl.pojo.Result;

@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
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
