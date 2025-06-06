package com.yxl.demo02;

public class StudentDate implements Dtta <Student>{


    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void updata(Student student) {

    }

    @Override
    public Student query(int id){
        return new Student();
    }
}
