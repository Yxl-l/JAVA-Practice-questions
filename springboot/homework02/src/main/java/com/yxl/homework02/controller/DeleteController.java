package com.yxl.homework02.controller;

import com.yxl.homework02.service.Impl.DeleteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 删除
 */
@CrossOrigin
@RestController
public class DeleteController {
@Autowired
private DeleteServiceImpl deleteService;
    @RequestMapping("/delete")
    public ResponseEntity<String> addlist(@RequestParam int id){

        return ResponseEntity.ok(deleteService.delete(id));
    }
}
