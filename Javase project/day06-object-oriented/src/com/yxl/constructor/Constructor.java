package com.yxl.constructor;
/*
* alt+ Implements 快捷键
* */
public class Constructor {
    private String name;
    private int age;

    public Constructor() {
    }

    public Constructor(int age,String name) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int a) {
        if (a < 0 || a > 150){
            System.out.println("年龄输入错误");
        }
        age = a;
    }
    public int getAge() {
        return age;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    //  toString()让打印对象名时直接打印对象的属性值
    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}