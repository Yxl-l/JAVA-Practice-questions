package com.yxl.demo02;

import java.util.ArrayList;

public class MyArrayList <T>{
    private ArrayList  list= new ArrayList();
    public boolean add(T t){
        list.add(t);
        return true;
    }
    public boolean remove(T t){
        return list.remove(t);
    }
    @Override
    public  String  toString(){
        return list.toString();
    }
}
