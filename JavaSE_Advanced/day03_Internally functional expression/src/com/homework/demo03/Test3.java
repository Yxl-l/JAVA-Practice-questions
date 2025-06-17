package com.homework.demo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("cxk",18,1990));
        arr.add(new Student("cxk",19,10));
        arr.add(new Student("cxk",4,4410));



        arr.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });

        arr.forEach( s -> System.out.println(s));
        arr.forEach(System.out::println);

    }
}
