package com.yxl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登录成功结果封装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginInfo {
    private Integer userId; //ID
    private String username; //用户名
    private String name; //姓名
    private String image; //头像
    private String token; //令牌

}