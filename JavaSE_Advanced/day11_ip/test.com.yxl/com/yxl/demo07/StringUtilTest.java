package com.yxl.demo07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void printNumber() {
        StringUtil.printNumber("dgfhsadfghsdf");
    }

    /***
     * 测试方法
     */
    @Test
    void getMaxIndex() {
        int index = StringUtil.getMaxIndex("dshgfdsfdsd");
        System.out.println(index);
    }

}