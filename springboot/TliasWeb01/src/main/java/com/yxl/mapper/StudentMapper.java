package com.yxl.mapper;

import com.yxl.pojo.Student;
import com.yxl.pojo.StudentQueryParam;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    List<Student> getStudent(StudentQueryParam studentQueryParam);

    void postStudent(Student student);

    Student getStudentById(Integer id);

    void putStudent(Student student);

    void deleteStudent(List<Integer> ids);

    void putViolationStudent(Integer id, Integer score);
    @MapKey("clazzType")
    List<Map<String, Object>> getStudentCountData();
    @MapKey("name")
    List<Map<String, Object>> getStudentDegreeData();

    int countClazzStudents(Integer id);
}
