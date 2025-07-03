package com.yxl.controller;

import com.yxl.pojo.Category;
import com.yxl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
@Autowired
private CategoryService categoryService;


    /***
     * 递归查询所有分类数据
     * @return
     */
    @GetMapping
 public List<Category> list(){
        return categoryService.list();
    }
}
