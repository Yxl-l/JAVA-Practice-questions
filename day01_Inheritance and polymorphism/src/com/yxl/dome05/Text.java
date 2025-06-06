package com.yxl.dome05;

public class Text {
    public static void main(String[] args) {
//        Fu z1=new Zi();//对象多态，不同对象用相同父类接收
//        z1.run();//行为多态，相同行为不同表现
//        Fu z2=new Zii();
//        z2.run();
        Fu p=new Zi();
        Tlias T=new Tlias();
        T.tlias(p);
        Fu c=new Zii();
        T.tlias(c);



    }
}
