package com.homework.demo07;

public class CardOperator {
    /**
     * 充值
     */
    public static void recharge(Card card,double money){
        card.recharge(money);
    }

    /**
     * 消费
     * @param card
     * @param money
     */
    public static void consume(Card card,double money){
        card.consume(money);
    }
}
