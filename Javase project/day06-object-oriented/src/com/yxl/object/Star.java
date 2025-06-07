package com.yxl.object;

public class Star {
    String name;
    int age;//年龄
    double height;//身高
    double weight;//体重
    double Chinese;//中文
    double  Math;//数学

    public void show()
    {
        System.out.println("姓名："+name+" 年龄："+age+" 身高："+height+" 体重："+weight);
    }
    public void eat()
    {
        System.out.println("吃东西");
    }

    public double num()
    {
        return (Chinese+Math)/2;
    }
    public double sum()
    {
        return Chinese+Math;
    }


}
