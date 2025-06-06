package com.yxl.demo01;

public class Text01 {
    public static void main(String[] args) {
        Student s1=new Student(01);
        s1.age=18;
        s1.name="蔡徐坤";
        s1.sex="男";
        s1.eat();
        tt1();
        com.yxl.dome02.Text01 t22=new com.yxl.dome02.Text01();
//        t22.eat(); private只能本类使用

        Pas paa =new Pas();
        paa.eat();

        Teacher teacher1=new Teacher();
        teacher1.name="蔡老师";
        teacher1.posts="java";
        teacher1.classId=177;
        System.out.println(teacher1);
    }



    private static void tt1(){
        System.out.println("private修饰只能本类用");
    }
}
