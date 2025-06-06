package com.work.demo02;

public class Text {
    public static void area(Shape shape){
        shape.area();
    }
    public static void circumference(Shape shape){
        shape.circumference();
    }
    public static void main(String[] args) {
        Round round = new Round();
        round.setR(10);
        area(round);
        circumference(round);


    }
}
