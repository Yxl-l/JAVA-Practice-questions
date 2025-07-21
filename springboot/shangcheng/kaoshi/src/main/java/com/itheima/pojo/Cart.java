package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart {
    private Integer id;
    private Integer itemId;
    private String itemName;
    private Integer price;
    private Integer count;
}
