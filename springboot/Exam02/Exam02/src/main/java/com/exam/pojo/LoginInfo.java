package com.exam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 登录成功结果封装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginInfo {
    private Integer userId; //员工ID
    private String username; //用户名
    private String name; //姓名
    private String token; //令牌
    private List<String> permissions;//权限
}