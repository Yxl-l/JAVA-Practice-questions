package com.yxl.demo02;

public class Text3 {
    public static void main(String[] args) {
        StudentDate studentDate = new StudentDate();
        studentDate.add(new Student());
        TeacherData teacherData = new TeacherData();
        teacherData.add(new Teacher());
        teacherData.query(0);
    }
}
