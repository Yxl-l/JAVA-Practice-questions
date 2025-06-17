package com.yxl.demo04;

import com.yxl.GAME.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("玛卡巴卡", 16, 170d);
        students[1] = new Student("玛卡", 18, 190d);
        students[2] = new Student("玛", 60, 180d);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        Arrays.sort(students,(Student o1, Student o2)->o1.getAge()- o2.getAge());

        System.out.println(Arrays.toString(students));

        Integer[] arr={10,45,23,54,76};
        Arrays.sort(arr,(o1, o2)->o2-o1);
        System.out.println(Arrays.toString(arr));


        }



}
