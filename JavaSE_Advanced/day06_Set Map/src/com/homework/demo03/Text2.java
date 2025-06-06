package com.homework.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text2 {
    public static void main(String[] args) {

        ShuffleDealCards(InitializeDeck());

    }

    private static void ShuffleDealCards(List<Brand> brands) {
        Collections.shuffle(brands);
        List<Brand> people1 = new ArrayList<>();
        List<Brand> people2 = new ArrayList<>();
        List<Brand> people3 = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            switch (i % 3) {
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
            System.out.print("\n"+"一号玩家手牌"+"\t");
            people1.sort((o1, o2) ->o1.getId()- o2.getId() );
            for (Brand brand : people1) {
                System.out.print(brand.getColor()+""+brand.getScore()+"\t");
            }
            System.out.print("\n"+"二号玩家手牌"+"\t");
            people2.sort((o1, o2) ->o1.getId()- o2.getId() );
            for (Brand brand : people2) {
                System.out.print(brand.getColor()+""+brand.getScore()+"\t");
            }
            System.out.print("\n"+"三号玩家手牌"+"\t");
            people3.sort((o1, o2) ->o1.getId()- o2.getId() );
            for (Brand brand : people3) {
                System.out.print(brand.getColor()+""+brand.getScore()+"\t");
            }
            System.out.print("\n"+"地主牌"+"\t");
            for (int j = brands.size()-3; j < brands.size(); j++) {
                System.out.print(brands.get(j).getColor()+""+brands.get(j).getScore()+"\t");
            }


    }

    public static List<Brand> InitializeDeck (){
        String[] scores = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
        String[] color = {"♠","♥","♣","♦"};
        List<Brand> brands = new ArrayList<>();
        int cont = 0;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                brands.add(new Brand(cont,scores[i],color[j] ));
                cont++;
            }
        }
        brands.add(new Brand(cont++,"小王","🃏"));
        brands.add(new Brand(cont,"大王","🃏"));
        if(brands.size()==54){
            System.out.println("牌组初始化完成");
        }
        return brands;
    }

}
