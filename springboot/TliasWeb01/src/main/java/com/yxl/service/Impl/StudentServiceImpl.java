package com.yxl.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yxl.mapper.StudentMapper;
import com.yxl.pojo.PageResult;
import com.yxl.pojo.Student;
import com.yxl.pojo.StudentQueryParam;
import com.yxl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentMapper;
    /**
     *  违纪处理
     */
    @Override
    public void putViolationStudent(Integer id, Integer score) {
        studentMapper.putViolationStudent(id,score);

    }
    /**
     * 删除学生
     */
    @Override
    public void deleteStudent(List<Integer> ids) {
        studentMapper.deleteStudent(ids);
    }
    /**
     * 修改信息
     */
    @Override
    public void putStudent(Student student) {
        student.setUpdateTime(LocalDateTime.now());
        studentMapper.putStudent(student);
    }
    /**
     * 根据id查询学生（回显）
     */
    @Override
    public Student getStudentById(Integer id) {

        return studentMapper.getStudentById(id);
    }
    /**
     * 添加学生
     */
    @Override
    public void postStudent(Student student) {
        student.setCreateTime(LocalDateTime.now());
        student.setUpdateTime(LocalDateTime.now());
        studentMapper.postStudent(student);
    }

    /**
     * 条件分页查询
     */
    @Override
    public PageResult getStudent(StudentQueryParam studentQueryParam) {
        PageHelper.startPage(studentQueryParam.getPage(),studentQueryParam.getPageSize());
        List<Student> list = studentMapper.getStudent(studentQueryParam);
        Page<Student> studentPage = (Page<Student>) list;
        return new PageResult(studentPage.getTotal(),studentPage.getResult());
    }
}
