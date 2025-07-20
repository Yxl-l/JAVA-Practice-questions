package com.yxl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartInfo {
    private Integer merchantId;
    private String merchantName;

    //购物车明细集合数据
    private List<Cart> carts;
}
