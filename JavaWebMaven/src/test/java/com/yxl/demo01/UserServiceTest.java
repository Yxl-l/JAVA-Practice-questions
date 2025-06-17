package com.yxl.demo01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    @Test
    public void testGetAge(){
      System.out.println(new UserService().getAge("sh8491fgd6h1s6hs4r6gsr46"));


    }

    @Test
    void testGetSex() {
       String sex = new UserService().getSex(14);
       String sex1 = new UserService().getSex(15);
        System.out.println( sex);
        Assertions.assertEquals("女",sex,"不相等");
        Assertions.assertNotEquals("女",sex,"相等");
        Assertions.assertNull(sex,"不是null");
        Assertions.assertNotNull(sex,"是null");
        Assertions.assertTrue(sex.equals("女"),"不是true");
        Assertions.assertFalse(sex.equals("女"),"不是false");
        Assertions.assertSame(sex,sex1,"不相等");
        Assertions.assertEquals("女",sex,"不相等");

    }
}
