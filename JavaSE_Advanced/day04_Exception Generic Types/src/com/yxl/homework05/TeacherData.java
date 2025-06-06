package com.yxl.homework05;

public class TeacherData implements DataQ<Teacher>{
    @Override
    public void add(Teacher teacher) {
        if (teacher.getName().isEmpty() || teacher.getName()== null){
            throw new RunTeacher("姓名不能为空");
        }
        System.out.println("添加成功");
    }

    @Override
    public void remove(Teacher teacher) {
        if (teacher.getName().isEmpty() || teacher.getName()== null){
            throw new RunStudent("修改姓名不能为空");
        }
        System.out.println("修改成功");
    }


    @Override
    public Teacher query(int id) {
        return null;
    }
}
