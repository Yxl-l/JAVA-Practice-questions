package com.yxl.GAME;

public abstract class Character {
    private String name;
    private int health;//生命值
    private int Shields;//护盾值
    private int attackPower;//攻击力
    private double defensPower;//防御系数
    private String elementAttached;//元素附着

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShields() {
        return Shields;
    }

    public void setShields(int shields) {
        Shields = shields;
    }

    public void setDefensPower(double defensPower) {
        this.defensPower = defensPower;
    }

    public String getElementAttached() {
        return elementAttached;
    }

    public void setElementAttached(String elementAttached) {
        this.elementAttached = elementAttached;
    }

    public Character(String name, int health, int shields, int attackPower, double defensPower, String elementAttached) {
        this.name = name;
        this.health = health;
        Shields = shields;
        this.attackPower = attackPower;
        this.defensPower = defensPower;
        this.elementAttached = elementAttached;
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void Q();


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public double getDefensPower() {
        return defensPower;
    }

    public void setDefensPower(int defensPower) {
        this.defensPower = defensPower;
    }
}
