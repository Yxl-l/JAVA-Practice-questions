package com.yxl.GAME;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        ArrayList<XIaoMi> xIaoMis=new ArrayList<>();
        xIaoMis.add(new XIaoMi());
        xIaoMis.add(new XIaoMi());
        ArrayList<BYD> byd = new ArrayList<>();
        byd.add(new BYD());
        byd.add(new BYD());
        go(xIaoMis);
        go(byd);

    }
    public static void go (ArrayList<? extends Car > cars){

    }
}
