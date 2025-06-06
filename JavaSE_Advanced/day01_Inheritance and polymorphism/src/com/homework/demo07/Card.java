package com.homework.demo07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card { private String cartId;
    private String name;
    private String phone;
    private double balance;

    /**
     * 充值
     * @param money
     */
    public void recharge (double money){
        this.balance+=money;
        System.out.println(name+"的卡片完成充值,余额"+balance+"元");

    }
    public void consume(double money){
        this.balance-=money;
    }



}
