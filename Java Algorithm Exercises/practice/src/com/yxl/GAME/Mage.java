package com.yxl.GAME;

public class Mage extends Character implements Skill {
    public Mage(String name, int health, int shields, int attackPower, double defensPower, String elementAttached) {
        super(name, health, shields, attackPower, defensPower, elementAttached);
    }

    @Override
    public void attack() {
        System.out.print("普通魔法攻击造成600点雷元素魔法伤害🎇🎇🎇🎇🎇");
    }

    @Override
    public void Q(){
        System.out.print("透光奇点 造成600点火元素魔法伤害🎇🎇🎇🎇🎇");
    }

    @Override
    public void defend() {
        System.out.print("获得魔法盾抵挡500伤害并造成100点火元素伤害🎇🎇🎇🎇🎇");
    }

    @Override
    public void useUlitmate() {
        System.out.print("终极闪光 造成1500点雷元素魔法伤害🎇🎇🎇🎇🎇");
    }

    @Override
    public void useDefensiveSkill() {
        System.out.println("金身 获得600点护盾和10%减伤");

    }
}
