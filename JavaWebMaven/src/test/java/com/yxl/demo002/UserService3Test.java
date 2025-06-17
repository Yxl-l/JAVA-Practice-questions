package com.yxl.demo002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserService3Test {
    private static final UserService1 userService1 = new UserService1();
    @Test
    void isBeijing() {
        boolean b = userService1.isBeijing(" 610110201909091231");
        Assertions.assertTrue(b,"不是京爷");
    }

    @Test
    void getAge() {
       Integer s =userService1.getAge(" 610110201909091231");
        Assertions.assertNull(s,"不合法");

    }

    @Test
    void getGender() {
        String s = userService1.getGender(" 110110201509091109");
        Assertions.assertEquals("女",s,"男");

    }

    @Test
    void getYear() {

       String s =userService1.getYear(" 610110201909091231");
        Assertions.assertNull(s,"不合法");

    }

    @Test
    void getMonth() {
        String s =userService1.getMonth(" 610110201909091231");
        Assertions.assertNull(s,"不合法");
    }
}