package com.yxl.demo01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveObjectFrameWorkTest {

    @Test
    void saveObject() throws Exception {
        Phone p = new Phone("苹果",6999.9);
        Student s = new Student("蔡徐坤",26);
        SaveObjectFrameWork.saveObject(p);
        SaveObjectFrameWork.saveObject(s);
    }
}