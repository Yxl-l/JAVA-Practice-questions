package com.yxl.Demo03;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        //1.public ArrayList()：创建一个存储字符串的集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.public boolean add(E e)：将指定的元素添加到此集合的末尾
        list.add("蔡徐坤");//添加成功返回true;
        list.add("陈立龙");
        list.add("范丞丞");
        //3.public void add(int index,E element)：在此集合中的指定位置插入指定的元素
        list.add(2,"鸡哥");
        list.add(3,"鸡哥");
        System.out.println(list);
        //4.public E get(int index)：返回指定索引处的元素
        System.out.println(list.get(2));
        //5.public int size()：返回集合中的元素的个数
        System.out.println(list.size());
        //6.public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        list.remove(1);
        System.out.println(list);

        //7.public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        list.remove("鸡哥");//只删除第一个
        System.out.println(list);
        //8.public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1,"全民制作人"));
        System.out.println(list);


    }
}
