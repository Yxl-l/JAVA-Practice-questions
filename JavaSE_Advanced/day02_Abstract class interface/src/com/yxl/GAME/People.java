package com.yxl.GAME;

public abstract class People {
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t我爸爸是一个好人，我特别喜欢他，他对我很好，我来介绍一下：");
        writeMain();
        System.out.println("\t我爸爸真好，你有这样的爸爸吗？");
    }

    public abstract void writeMain();

}
