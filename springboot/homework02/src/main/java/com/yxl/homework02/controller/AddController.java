package com.yxl.homework02.controller;

import com.yxl.homework02.service.Impl.AddListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddController {
    @Autowired
    private AddListServiceImpl addListServiceImpl;

    @RequestMapping("/add")
    public ResponseEntity<String> addlist(@RequestParam int id,
                                          @RequestParam String name,
                                          @RequestParam String image,
                                          @RequestParam Integer gender,
                                          @RequestParam Integer job) {
        addListServiceImpl.addList(id, name, image, gender, job);
        return ResponseEntity.ok("添加成功");
    }
}
