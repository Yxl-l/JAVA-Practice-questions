package com.yxl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
 private Integer id;
 private String name;
 private Integer gender;
 private String createTime;
}
