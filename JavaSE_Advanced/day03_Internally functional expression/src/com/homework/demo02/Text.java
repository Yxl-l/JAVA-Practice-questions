package com.homework.demo02;

public class Text {
    public static void main(String[] args) {
//        Car.Engine engine = new Car().new Engine();
//        engine.show();
//       Car.Ae ae = new Car.Ae();
//       ae.add((new Car()));
        Student student = new Student() {
            @Override
            public void show(String a) {
                System.out.println(a);
            }
        };
        (new Student(){
            @Override
            public void show(String a) {
                System.out.println(a);
            }
        }).show("11111");


        student.show("123");



    }
}
