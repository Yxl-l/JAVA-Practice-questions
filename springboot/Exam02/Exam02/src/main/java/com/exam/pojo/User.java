package com.exam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 用户
 * user（用户）
 * ├── user_id
 * ├── name
 * ├── user_name
 * └── pass_word
 *
 * role（角色）
 * ├── role_id
 * └── role_name
 *
 * permission（权限）
 * ├── permission_id
 * └── permission_name
 *
 * user_role（用户-角色关联表）
 * ├── user_id
 * └── role_id
 *
 * role_permission（角色-权限关联表）
 * ├── role_id
 * └── permission_id
 */

public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String passWord;

   private List<Role> role ;

}
