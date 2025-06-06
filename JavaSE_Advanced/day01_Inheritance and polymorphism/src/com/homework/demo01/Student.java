package com.homework.demo01;

public class Student extends Person{
   private int classId;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classId=" + classId +
                '}';
    }
}
