package com.homework.demo04;

public class Text {
    public static void main(String[] args) {
        Shape elliptical = new Elliptical();
        Tool.tool(elliptical);
        elliptical.area();
        Shape rotundity = new Rotundity();
        Tool.tool(rotundity);
    }
}
