package com.yxl.d1_single;

public class B {
    private static B b;
    private B(){}
    public static B getInstance(){
        if(b==null){
            b=new B();
        }
        return b;
    }
}
