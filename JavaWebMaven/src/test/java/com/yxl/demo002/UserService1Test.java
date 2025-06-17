package com.yxl.demo002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserService1Test {
    private static final UserService1 userService1 = new UserService1();
    @Test
    void isBeijing() {
        System.out.println(userService1.isBeijing(" 610110201909091231"));
    }

    @Test
    void getAge() {
        System.out.println(userService1.getAge(" 610110201909091231"));

    }

    @Test
    void getGender() {
        System.out.println(userService1.getGender(" 110110201509091109"));
    }

    @Test
    void getYear() {
        System.out.println(userService1.getYear(" 110110201509091109"));
    }

    @Test
    void getMonth() {
        System.out.println(userService1.getMonth(" 110110201509091109"));
    }
}