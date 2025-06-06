package com.yxl.homework05;

public class StudentData implements DataQ <Student>{

    @Override
    public void add(Student student) {
        if (student.getName().isEmpty() || student.getName()== null){
            throw new RunStudent("姓名不能为空");
        }
        System.out.println("添加成功");
    }

    @Override
    public void remove(Student student) {
        if (student.getName().isEmpty() || student.getName()== null){
            throw new RunStudent("修改姓名不能为空");
        }
        System.out.println("修改成功");
    }


    @Override
    public Student query(int id) {
        return null;
    }
}
