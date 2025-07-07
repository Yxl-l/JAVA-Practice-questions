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
 */

public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String passWord;

   private List<Role> role ;

}
