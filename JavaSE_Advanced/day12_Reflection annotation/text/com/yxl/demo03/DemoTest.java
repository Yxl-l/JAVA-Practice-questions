package com.yxl.demo03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

class DemoTest {
    @Test
   public void parseclass()throws Exception{
       Class c = Demo.class;
       System.out.println("=========类=========");
       if(c.isAnnotationPresent(Mytext2.class)){
           Mytext2 mytext2 = (Mytext2) c.getDeclaredAnnotation(Mytext2.class);
           System.out.println(mytext2.height());
           System.out.println(mytext2.value());
           System.out.println(Arrays.toString(mytext2.address()));
       }

       System.out.println("=========方法=========");
       Method[] methods = c.getDeclaredMethods();
       for (Method method : methods) {
           if (method.isAnnotationPresent(Mytext2.class)){
               Mytext2 mytext2 =method.getDeclaredAnnotation(Mytext2.class);
               System.out.println(mytext2.height());
               System.out.println(mytext2.value());
               System.out.println(Arrays.toString(mytext2.address()));
           }

       }


   }

}