package com.yxl.demo01;

import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class StudentTest {
    @Test
    public void getclassInfo() throws Exception{
        Class c1 = Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        Constructor constructor1 = c1.getDeclaredConstructor();//获取无参
        System.out.println(constructor1);
        Constructor constructor2 = c1 .getDeclaredConstructor(String.class,int.class);//获取两个参数的
        System.out.println(constructor2);
        Constructor[] constructors = c1.getConstructors();//获取全部公开的
        for (Constructor constructor : constructors) {
            System.out.println(constructor);

        }
        Constructor[] constructors2 = c1.getDeclaredConstructors();//获取全部

        for (Constructor constructor : constructors2) {
            System.out.println(constructor);
        }



    }


    @Test
    public void getFidldInfo()throws Exception{
        Class c1 = Student.class;
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+"("+field.getType().getName()+")");
        }

        Field fieldName = c1.getDeclaredField("name");
        Field fieldAge = c1.getDeclaredField("age");
        System.out.println(fieldName.getName()+"("+fieldName.getType().getName()+")");
        System.out.println(fieldAge.getName()+"("+fieldAge.getType().getName()+")");

        Student s1 = new Student();
        fieldName.setAccessible(true);
        fieldName.set(s1,"蔡徐坤");
        fieldAge.setAccessible(true);
        fieldAge.set(s1,25);
        System.out.println(s1);
        String name = (String) fieldName.get(s1);//Field对象返回的是object类型
        System.out.println(name);

    }
    @Test
    public  void  getMethodInfo() throws Exception {
        Class c1 = Student.class;
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+"("+method.getParameterCount()+")");
        }

        Method methodEat = c1.getDeclaredMethod("eat", String.class);
        Constructor constructor = c1.getDeclaredConstructor();
        Object o = constructor.newInstance();
        methodEat.setAccessible(true);
        methodEat.invoke(o,"辣条");

    }


}