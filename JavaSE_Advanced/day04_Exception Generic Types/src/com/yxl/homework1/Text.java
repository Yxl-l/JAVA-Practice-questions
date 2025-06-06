package com.yxl.homework1;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        ArrayList <Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("张三",100));
        arrayList.add(new Student("李四",90));
        arrayList .add(new Student("王五",80));
         arrayList.add(new Student("赵六",70));
         double scoreMin=arrayList .get(0).getScore();
         int index=0;
         for (Student student : arrayList){
              if (student.getScore()<scoreMin){
                 scoreMin=student.getScore();
                 index=arrayList.indexOf(student);
             }
         }
          System.out.println("最低分是："+scoreMin);
         arrayList.remove(index);
          System.out.println(arrayList.toString());
    }
}
