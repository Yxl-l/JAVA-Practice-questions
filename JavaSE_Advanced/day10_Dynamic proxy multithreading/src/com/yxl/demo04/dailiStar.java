package com.yxl.demo04;



public class dailiStar implements Star{
    private Star bigStar;

    public dailiStar(BigStar bigStar) {
        this.bigStar = bigStar;
    }

    @Override
    public void sing(String name) {
        System.out.println("唱歌收费1000w");
        bigStar.sing("及你太美");
    }

    @Override
    public String dance() {
        System.out.println("跳舞需要篮球🏀");
        bigStar.dance();
        return "";
    }
}
