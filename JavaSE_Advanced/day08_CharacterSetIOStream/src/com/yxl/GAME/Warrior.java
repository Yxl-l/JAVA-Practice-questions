package com.yxl.GAME;

public class Warrior extends Character implements Skill{
    public Warrior(String name, int health, int shields, int attackPower, double defensPower, String elementAttached) {
        super(name, health, shields, attackPower, defensPower, elementAttached);
    }

    @Override
    public void attack() {
        System.out.print("普通物理攻击造成700点物理伤害🎇🎇🎇🎇🎇");
    }
    @Override
    public void Q(){
        System.out.print("荒漠之咬 - 造成200点物理伤害并破除对方护盾🎇🎇🎇🎇🎇");
    }


    @Override
    public void defend() {
        System.out.println("坚定之心 -收到伤害减少20%");

    }

    @Override
    public void useUlitmate() {
<<<<<<< HEAD
        System.out.print("德玛西亚正义 造成目标已损失生命值40%+4000的真实伤害（无视减伤效果）🎇🎇🎇🎇🎇");
=======
        System.out.print("德玛西亚正义 造成目标已损失生命值40%+400的真实伤害（无视减伤效果）🎇🎇🎇🎇🎇");
>>>>>>> 6b9a9702f42821f31d5a9767582f2ba2cfd3a733

    }

    @Override
    public void useDefensiveSkill() {
<<<<<<< HEAD
        System.out.println("狂徒 回复20%最大生命值");
=======
        System.out.println("狂徒 回复30%最大生命值");
>>>>>>> 6b9a9702f42821f31d5a9767582f2ba2cfd3a733

    }
}
