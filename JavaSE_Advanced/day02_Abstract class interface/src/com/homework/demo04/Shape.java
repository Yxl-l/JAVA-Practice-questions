package com.homework.demo04;

public interface Shape {
    void draw();

    default void area(){
        System.out.println("计算面积成功");
    }
}
