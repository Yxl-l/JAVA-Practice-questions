package com.yxl.pojo;

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
    private String spec;
    private Integer price;
    private Integer realPrice;
    private Integer count;
    private String merchantName;
    private Integer merchantId;
}
