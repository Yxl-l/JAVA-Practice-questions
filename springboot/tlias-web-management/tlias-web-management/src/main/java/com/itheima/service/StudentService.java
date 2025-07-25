package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;

public interface StudentService extends IService<Student> {

    PageResult getPage(StudentQueryParam studentQueryParam);

    void updateViolation(Integer id, Integer score);
}
