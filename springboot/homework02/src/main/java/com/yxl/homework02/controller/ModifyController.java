package com.yxl.homework02.controller;

import com.yxl.homework02.service.Impl.ModifyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 修改
 */
@CrossOrigin
@RestController
public class ModifyController {
    @Autowired
    private ModifyServiceImpl modifyServiceImpl;
    @RequestMapping("/modify")
    public ResponseEntity<String> modifyList(@RequestParam int id,
                                             @RequestParam String name,
                                             @RequestParam String image,
                                             @RequestParam Integer gender,
                                             @RequestParam Integer job){
        return  ResponseEntity.ok(modifyServiceImpl.modify(id, name, image, gender, job));

    }
}
