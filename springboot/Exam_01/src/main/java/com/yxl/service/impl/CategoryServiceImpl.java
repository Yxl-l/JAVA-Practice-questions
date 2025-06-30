package com.yxl.service.impl;

import com.yxl.mapper.CategoryMapper;
import com.yxl.pojo.Category;
import com.yxl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /***
     * 分类信息查询
     * @return
     */
    @Override
    public List<Category> list() {
        List<Category> list = categoryMapper.list();
        List<Category> topFloor = list.stream().filter(category -> category.getParentId()==0).collect(Collectors.toList());
        List<Category> children = list.stream().filter(category -> category.getParentId()>0).collect(Collectors.toList());
        topFloor.forEach(c->findChildren(c,children));

        return topFloor;
    }

    /***
     * 递归查找
     * current:当前执行查找的对象
     * all:所有子类分类数据
     */
    public void findChildren(Category category,List<Category> all){
            List<Category> children = all.stream().filter(c->Objects.equals(c.getParentId(),category.getId())).collect(Collectors.toList());
            children.forEach(c->findChildren(c,all));
            category.setChildren(children);

    }
}
