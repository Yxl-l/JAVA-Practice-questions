package com.homework.demo06;

public class Silver extends Card{
    public Silver(String cartId, String name, String phone, double balance) {
        super(cartId, name, phone, balance);
    }
    @Override
    public void consumption(double money,double balance) {
        if(money*0.9<=balance){
            System.out.println("支付成功，消费"+money*0.9+"元,当前余额"+(balance-money*0.9));
        }
        else {
            System.out.println("余额不足请充值");
        }
    }
}
