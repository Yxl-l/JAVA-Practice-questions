package com.yxl.homework02.controller;
import com.yxl.homework02.entity.People;
import com.yxl.homework02.service.Impl.InquireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 查询
 */
@CrossOrigin
@RestController
public class InquireController {
    @Autowired
    private InquireServiceImpl inquireServiceImpl;
    @RequestMapping("/inquire")
    public List<People> inquireList(@RequestParam(required = false) String name,
                                    @RequestParam(required = false) Integer gender,
                                    @RequestParam(required = false) Integer job){

        return inquireServiceImpl.inquire(name, gender, job);
    }
}
