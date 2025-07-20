package com.itheima.controller;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequestMapping("/clazzs")
@RestController
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @GetMapping
    public Result list(String name,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end,
                       @RequestParam(defaultValue = "1") int page,
                       @RequestParam(defaultValue = "10") int pageSize) {
        log.info("查询班级列表");
        EmpQueryParam empQueryParam = new EmpQueryParam(page, pageSize, name, null, begin, end);
        PageResult<Clazz> pageResult = clazzService.getPage(empQueryParam);
        return Result.success(pageResult);
    }

    @PostMapping
    public Result save(@RequestBody Clazz clazz) {
        log.info("新增班级：{}", clazz);
        clazz.setUpdateTime(LocalDateTime.now());
        clazz.setCreateTime(LocalDateTime.now());
        clazzService.save(clazz);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查询班级：{}", id);
        Clazz byId = clazzService.getById(id);
        return Result.success(byId);
    }

    @PutMapping
    public Result update(@RequestBody Clazz clazz) {
        log.info("修改班级：{}", clazz);
        clazz.setUpdateTime(LocalDateTime.now());
        clazzService.updateById(clazz);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("删除班级：{}", id);
        clazzService.removeById(id);
        return Result.success();
    }

    @GetMapping("/list")
    public Result list() {
        log.info("查询全部班级");
        List<Clazz> list = clazzService.list();
        return Result.success(list);
    }
}
