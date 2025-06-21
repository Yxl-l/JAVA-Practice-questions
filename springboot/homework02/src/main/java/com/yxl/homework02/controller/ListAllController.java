package com.yxl.homework02.controller;

import com.yxl.homework02.entity.People;
import com.yxl.homework02.service.Impl.ListAllServiceImpl;
import com.yxl.homework02.service.ListAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 所有员工
 */
@CrossOrigin
@RestController
public class ListAllController {
    @Autowired
    private ListAllServiceImpl listAllServiceImpl;
    @RequestMapping("/all")
    public List<People> listAll(){
        return listAllServiceImpl.listAll();
    }
}
