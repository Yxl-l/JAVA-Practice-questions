package com.yxl.demo03;

public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    @Override
    public void sing(String name) {
        System.out.println(this.name+"唱歌了，唱的"+name);
    }

    @Override
    public String dance() {
        System.out.println(this.name+"跳舞了");
        return "鸡你太美oh baby";
    }
}
