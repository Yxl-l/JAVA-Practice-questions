package com.yxl.staticXiuShi;

public class Student {
    static String schoolName;
    static int grade;
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    {
        System.out.println("实例代码块执行了，每次创建对象都执行一次");
    }
    static {
        System.out.println("静态代码块执行了，只执行一次，在类加载时执行");
    }

    public void auv(){
        System.out.println("实列方法可以访问所有,可以用this");
    }
    public static void aug(){
        System.out.println("static静态方法只能访问静态成员变量和静态方法,静态方法不能用this.");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
