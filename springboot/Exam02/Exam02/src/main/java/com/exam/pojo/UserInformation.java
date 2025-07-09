package com.exam.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 用户信息用于查询用户全部信息时返回
 */
public class UserInformation {
    private Integer userId;
    private String name;
    private String userName;
    private String passWord;
    private List<String> roleName;
    private List<String> permissionName;


}
