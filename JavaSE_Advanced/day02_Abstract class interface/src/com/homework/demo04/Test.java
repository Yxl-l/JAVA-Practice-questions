package com.homework.demo04;

public class Test {
    public static void main(String[] args) {
        Shape elliptical = new Elliptical();
        Tool.tool(elliptical);
        elliptical.area();
        Shape rotundity = new Rotundity();
        Tool.tool(rotundity);
    }
}
