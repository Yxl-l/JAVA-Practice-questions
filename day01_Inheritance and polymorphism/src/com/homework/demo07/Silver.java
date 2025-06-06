package com.homework.demo07;

public class Silver extends Card{
    public Silver (String cardId, String phone, String name, double balance) {
        super(cardId, phone, name, balance);
        if (balance<2000){
            System.out.println("不满足金卡充值条件,无法办理金卡");
        }
    }

    @Override
    public void consume(double money) {
        double discountMoney=money*0.9;
        if(discountMoney>getBalance()){
            System.out.println("余额不足请充值");
            return;
        }
        setBalance(getBalance()-discountMoney);
        System.out.println(getName()+"消费金额"+money+",实际支付"+discountMoney+",账户余额"+getBalance());

    }
}
