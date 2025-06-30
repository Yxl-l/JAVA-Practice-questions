package com.yxl.service;

import com.yxl.pojo.PageResult;
import com.yxl.pojo.Result;
import com.yxl.pojo.Student;
import com.yxl.pojo.StudentQueryParam;

import java.util.List;


public interface StudentService {


     PageResult getStudent(StudentQueryParam studentQueryParam);

     void postStudent(Student student);

     Student getStudentById(Integer id);

     void putStudent(Student student);

     void deleteStudent(List<Integer> ids);

     void putViolationStudent(Integer id, Integer score);
}
