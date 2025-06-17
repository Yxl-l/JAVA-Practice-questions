package com.yxl.demo002;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserService2Test {

    private static final UserService1 userService1 = new UserService1();
    @ParameterizedTest
    @ValueSource(strings = {" 610110201909091231"," 110110201509091109","510310198812120931"})
    void isBeijing(String string) {
        System.out.println(userService1.isBeijing(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {" 610110201909091231"," 110110201509091109","510310198812120931"})
    void getAge(String string) {
        System.out.println(userService1.getAge(string));

    }

    @ParameterizedTest
    @ValueSource(strings = {" 610110201909091231"," 110110201509091109","510310198812120931"})
    void getGender(String string) {
        System.out.println(userService1.getGender(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {" 610110201909091231"," 110110201509091109","510310198812120931"})
    void getYear(String string) {
        System.out.println(userService1.getYear(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {" 610110201909091231"," 110110201509091109","510310198812120931"})
    void getMonth(String string) {
        System.out.println(userService1.getMonth(string));
    }
}