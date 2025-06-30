package com.yxl.utils;
/***
 * 数据不允许为空异常
 */
public class NotNullException extends RuntimeException{

    public NotNullException(String message) {
        super(message);
    }
}