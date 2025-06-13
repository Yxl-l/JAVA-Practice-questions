package com.yxl.demo01;

import java.io.File;
import java.io.FileOutputStream;

import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork{
    public static void saveObject(Object object)throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream("../day12_Reflection annotation/1.txt",true));
        Class<?> c = object.getClass();
        String className = c.getSimpleName();//获取类名
        ps.println(c.getSimpleName());
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
           ps.println(field.getName()+"="+field.get(object));
        }
        ps.close();


    }
}
