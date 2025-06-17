package com.yxl.demo01;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserPrintTest {
    private static UserPrint userPrint;
    @BeforeAll
    public static void newP(){
       userPrint = new UserPrint();
        System.out.println("BeforeAll执行了");
    }
    @BeforeEach
    public void QQ(){
        System.out.println("BeforeEach执行了");
    }

    @ParameterizedTest
    @ValueSource(strings={"QQ","QQQQWEEW","WEFWEFQEFQ"})
    void upData(String string) {
        userPrint.upData(string);

    }

    @AfterEach
    public void ww(){
        System.out.println("AfterEach执行了");
    }
    @AfterAll
    public static void RR(){
        System.out.println("AfterAll执行了");
    }
}