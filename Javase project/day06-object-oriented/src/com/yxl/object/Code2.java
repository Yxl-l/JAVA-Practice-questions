package com.yxl.object;

public class Code2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        System.out.println(s1.getName()+"今年"+s1.getAge()+"岁");
        Student s2 =new  Student();
        s2.setName("李四");
        s2.setAge(20);
        System.out.println(s2.getName()+"今年"+s2.getAge()+"岁");
    }
}
