package com.exam.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResult extends User {
    private Integer page;//当前页
    private Integer pageSize;//每页条数

}
