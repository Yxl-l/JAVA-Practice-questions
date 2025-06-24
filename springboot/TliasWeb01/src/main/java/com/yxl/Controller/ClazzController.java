package com.yxl.Controller;

import com.yxl.pojo.Clazz;
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
     *分页查询
     */
    @GetMapping
    public Result getClazzBy(@RequestParam(required = false) String name,
                             @RequestParam(required = false) String begin,
                             @RequestParam(required = false) String end,
                             @RequestParam(required = false) Integer page ,
                             @RequestParam(required = false) Integer pageSize
                             ){
        log.info("分页查询");
        return Result.success(clazzService.getClazzBy(name,begin,end,page,pageSize));
    }




}
