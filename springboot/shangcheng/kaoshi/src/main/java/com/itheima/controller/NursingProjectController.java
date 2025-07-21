package com.itheima.controller;


import com.itheima.pojo.NursingProject;
import com.itheima.pojo.NursingProjectParam;
import com.itheima.pojo.Result;
import com.itheima.service.NursingProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/nursingProject")
public class NursingProjectController {

    @Autowired
    private NursingProjectService nursingProjectService;

    @GetMapping
    public Result page(NursingProjectParam nursingProjectParam){
        return Result.success(nursingProjectService.page(nursingProjectParam));
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        NursingProject byId = nursingProjectService.getById(id);
        return Result.success(byId);
    }

    @PostMapping
    public Result add(@RequestBody NursingProject nursingProject){
        nursingProject.setCreateTime(LocalDateTime.now());
        nursingProject.setUpdateTime(LocalDateTime.now());
        nursingProjectService.save(nursingProject);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody NursingProject nursingProject){
        nursingProject.setUpdateTime(LocalDateTime.now());
        nursingProjectService.updateById(nursingProject);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids){
        nursingProjectService.removeByIds(ids);
        return Result.success();
    }
}
