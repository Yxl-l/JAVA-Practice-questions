package com.yxl.GAME;

public class Teax {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃鱼");
            }
        };
        cat.eat();

        motion(new AnimalQ() {
            @Override
            public void rnn() {
                System.out.println("小猫在跑步");
            }
        });
        motion(new AnimalQ() {
            @Override
            public void rnn() {
                System.out.println("小狗在快速的跑");
            }
        });

    }
    public static void motion(AnimalQ animalQ){
        System.out.println("动物参加运动");
        animalQ.rnn();
    }
}
