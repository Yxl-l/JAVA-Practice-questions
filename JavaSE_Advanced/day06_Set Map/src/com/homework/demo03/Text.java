package com.homework.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 1.牌类。点数、花色、序号
 * 2.添加54牌到集合，洗牌，发牌，排序。看牌打印
 */
public class Text {
    public static void main(String[] args) {
        String[] scores = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
        String[] color = {"♠","♥","♣","♦"};
        List<Brand> brands = new ArrayList<>();
            int cont=0;
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 4; j++) {
                    brands.add(new Brand(cont,color[j],scores[i]));
                    cont++;
                }
            }
            brands.add(new Brand(cont++,"小王","🃏"));
            brands.add(new Brand(cont++,"大王","🃏"));

        ShuffleDeal(brands);
    }

    private static void ShuffleDeal(List<Brand> brands) {
        //打乱牌序
        Collections.shuffle(brands);
        //创建三个玩家手牌集合
        List<Brand> people1 = new ArrayList<>();
        List<Brand> people2 = new ArrayList<>();
        List<Brand> people3 = new ArrayList<>();
       //发牌过程
        for (int i = 0; i < 51; i++) {
                switch (i%3){
                case 0:
                    people1.add(brands.get(i));
                    break;
                case 1:
                    people2.add(brands.get(i));
                    break;
                case 2:
                    people3.add(brands.get(i));
                    break;
                default:
                    break;
                }
        }
        //玩家手牌按牌内部id编号排序并打印
        people1.sort((o1, o2) -> o1.getId() - o2.getId());
        System.out.print("一号玩家手牌:");
        for (Brand brand : people1) {
            System.out.print(brand.getColor()+""+brand.getScore()+"\t");
        }

        people2.sort((o1, o2) -> o1.getId() - o2.getId());
        System.out.print("\n"+"二号玩家手牌:");
        for (Brand brand : people2) {
            System.out.print(brand.getColor()+""+brand.getScore()+"\t");
        }

        people3.sort((o1, o2) -> o1.getId() - o2.getId());
        System.out.print("\n"+"三号玩家手牌:");
        for (Brand brand : people3) {
            System.out.print(brand.getColor()+""+brand.getScore()+"\t");
        }

        System.out.println("\n"+"地主牌："
                +brands.get(51).getColor()+""+brands.get(51).getScore()+"\t"
                +brands.get(52).getColor()+""+brands.get(52).getScore()+"\t"
                +brands.get(53).getColor()+""+brands.get(53).getScore()+"\t");
    }
}
