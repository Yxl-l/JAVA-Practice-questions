package com.yxl.demo04;

public class Text {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeRenderer.render(circle);
        Shape rectangle = new Rectangle();
        ShapeRenderer.render(rectangle);
    }
}
