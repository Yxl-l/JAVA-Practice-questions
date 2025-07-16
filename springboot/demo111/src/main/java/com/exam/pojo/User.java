package com.exam.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId; //ID,主键
    private String name; //姓名
    private String username; //用户名
    private String password; //密码
    private Integer age;//年龄
    private String image; //头像
}
