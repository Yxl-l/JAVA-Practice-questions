package com.yxl.Controller;

import com.yxl.pojo.Clazz;
import com.yxl.pojo.ClazzQueryParam;
import com.yxl.pojo.Result;
import com.yxl.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/clazzs")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    /**
     * 添加班级
     */
    @PostMapping
    public Result postClazz(@RequestBody Clazz clazz){
        log.info("添加班级");
        clazzService.postClazz(clazz);
        return Result.success("添加成功");
    }
    /**
     *全部查询
     */
    @GetMapping("/list")
    public Result getClazz(){
        log.info("查询全部班级");
        return Result.success(clazzService.getClazz());
    }
    /**
     * 条件分页查询班级
     */
    @GetMapping
    public Result getClazzList(ClazzQueryParam clazzQueryParam){
        log.info("条件分页查询班级：{}",clazzQueryParam);
        return Result.success(clazzService.getClazzList(clazzQueryParam));

    }
/**
 * 根据id删除班级
 */
@DeleteMapping("/{id}")
public Result deleteClazz(@PathVariable Integer id){
    log.info("删除id为{}的班级",id);
    clazzService.deleteClazz(id);
    return Result.success("删除成功");
}
/**
 * 编辑班级
 */
@PutMapping
    public Result putClazz(@RequestBody Clazz clazz){
    log.info("修改用户信息");
    clazzService.putClazz(clazz);
    return Result.success("修改成功");
}
/**
 * 数据回显id
 */
@GetMapping("/{id}")
    public Result getClazzId(@PathVariable Integer id){
    log.info("回显");
    return Result.success(clazzService.getClassId(id));
}
}
