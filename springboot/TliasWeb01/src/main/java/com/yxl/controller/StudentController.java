package com.yxl.controller;

import com.yxl.pojo.Result;
import com.yxl.pojo.Student;
import com.yxl.pojo.StudentQueryParam;
import com.yxl.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    /**
     *  违纪处理
     */
    @PutMapping("/violation/{id}/{score}")
    public Result putViolationStudent(@PathVariable Integer id,
                                      @PathVariable Integer score){
        log.info("违纪处理违纪处理");
        studentService.putViolationStudent(id,score);
        return Result.success("删除成功");
    }
    /**
     * 删除学生
     */
    @DeleteMapping("/{ids}")
    public Result deleteStudent(@PathVariable List<Integer> ids){
        log.info("删除学生删除学生删除学生");
        studentService.deleteStudent(ids);
        return Result.success("删除成功");
    }
    /**
     * 修改信息
     */
    @PutMapping
    public Result putStudent(@RequestBody Student student){
        log.info("修改修改修改学生");
        studentService.putStudent(student);
        return Result.success("修改成功");
    }

/**
 * 根据id查询学生（回显）
 */
    @GetMapping("/{id}")
    public Result getStudentById(@PathVariable Integer id){
        log.info("根据id查询学生");
        return Result.success(studentService.getStudentById(id));
    }
    /**
     * 添加学生
     */
    @PostMapping
    public Result postStudent(@RequestBody Student student) {
        log.info("添加学生");
        studentService.postStudent(student);
        return Result.success("添加成功");
    }

    /**
     * 条件分页查询
     */
    @GetMapping
    public Result getStudent(StudentQueryParam studentQueryParam) {
        log.info("条件分页查询");
        return Result.success(studentService.getStudent(studentQueryParam));
    }
}
