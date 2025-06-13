package com.yxl.demo02;

public @interface MyText1 {
     String name();
     int age() default 18;
     String[]  address();


}
