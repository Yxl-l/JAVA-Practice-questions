package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Good {
    private Integer id;
    private String name;
    private Integer fuid;
    private List<Good> ziList;
}
