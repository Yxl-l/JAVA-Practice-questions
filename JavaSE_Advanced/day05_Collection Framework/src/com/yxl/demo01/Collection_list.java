package com.yxl.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Collection_list {
    public static void main(String[] args) {
        Collection<String> arr=new ArrayList<>();
         arr.add("张三");
          arr.add("李四");
          arr.add("王五");
        System.out.println( arr);
         arr.remove( "张三");//删除第一个匹配到的元素
          System.out.println( arr);
           System.out.println( arr.isEmpty());//判断是否为空，是ture
          System.out.println( arr.contains("张三"));//判断是否有某个数据
        Object [] arrO = arr.toArray();//转换为数组
        System.out.println(Arrays.toString(arrO));
        String [] arrS = arr.toArray(String[]::new);//转换为字符串数组
        System.out.println(Arrays.toString(arrS));

        arr.clear();//清空集合



    }
}
