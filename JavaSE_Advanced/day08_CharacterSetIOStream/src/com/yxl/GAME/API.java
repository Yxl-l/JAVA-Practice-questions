package com.yxl.GAME;

import java.util.Scanner;

public class API {
    /**
     *血量护盾元素状态显示并判断是否有角色死亡，有死亡返回true
     */
    public static boolean hp(Character guanghui,Character gailun){
        System.out.println(guanghui.getName()+"剩余HP"+guanghui.getHealth()+"\t"+"剩余护盾"+guanghui.getShields()+"\t"+"\t"+"元素附着"+guanghui.getElementAttached()+"\t"+"\t"+"承伤系数"+ String.format("%.2f", guanghui.getDefensPower())+
                "\t"+"==============="+"\t"+"\t"+gailun.getName()+"剩余HP"+gailun.getHealth()+"\t"+"剩余护盾"+gailun.getShields()+"\t"+"\t"+"元素附着"+gailun.getElementAttached()+"\t"+"\t"+"承伤系数"+ String.format("%.2f", gailun.getDefensPower()));
        if (gailun.getHealth() <= 0 || guanghui.getHealth() <= 0){
            return true;//任意角色死亡返回false
        }
        return false;
    }

    /**
     * 计算伤害
     */
    public static int hurt(int a,Character character){
        return (int) (a*character.getDefensPower());//伤害*减伤系数，返回造成伤害值
    }

    /**
     * 扣血系统
     * @param a
     * @param character
     */
    public static void withholdBlood(int a,Character character){
        int b = (character.getShields()-a);//护盾-伤害看是否剩余护盾
        if (b<=0){//伤害大于护盾
            character.setShields(0);
            character.setHealth(character.getHealth()+b);//扣血
        }else {
            character.setShields(b);
        }
   }

    /**
     * 元素反应
     * @param s
     * 伤害元素类型
     * @param character
     * 被攻击对象
     */
    public static void elementalReactions(String s , Character character){
        if (character.getElementAttached().equals("无")){
            character.setElementAttached(s);//目标身上没有元素则给对方附着本次攻击的元素
        }
        if(!character.getElementAttached().equals(s)){
            System.out.println("触发超载反应额外造成400点魔法伤害!实际伤害"+hurt(400,character));
            withholdBlood(hurt(400,character),character);
            character.setElementAttached("无");//反应后重置元素附着
        }

    }
    /**
     * 光辉战斗系统
     * @param guanghui
     * @param gailun
     */
    public static boolean guanghui (Mage guanghui,Character gailun,boolean big){
        System.out.println("选择光辉的操作");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.普通魔法攻击造成600点雷元素魔法伤害" +"\t"+"2.透光奇点 造成600点火元素魔法伤害");
        System.out.println("3.获得魔法盾抵挡500伤害并造成100点火元素伤害" +"\t"+"\t"+"4.限定大招-终极闪光 造成1500点雷元素魔法伤害");
        System.out.println("5.金身 获得500点护盾和10%减伤" );
        int tab = sc.nextInt();
        switch (tab){
            case 1:
                guanghui.attack();
                System.out.println("实际对盖伦造成"+hurt(600,gailun)+"雷元素伤害");
                withholdBlood(hurt(600,gailun),gailun);
                elementalReactions("雷",gailun);

                break;
            case 2:
                guanghui.Q();
                System.out.println("实际对盖伦造成"+hurt(600,gailun)+"火元素伤害");
                withholdBlood(hurt(600,gailun),gailun);
                elementalReactions("火",gailun);

                break;
            case 3:
                guanghui.defend();
                guanghui.setShields(500);//护盾不能叠加只能刷新
                System.out.println("实际对盖伦造成"+hurt(200,gailun)+"伤害");
                withholdBlood(hurt(200,gailun),gailun);
                elementalReactions("火",gailun);
                break;
            case 4:
                if (big) {
                    big=false;
                    guanghui.useUlitmate();
                    System.out.println("实际对盖伦造成" + hurt(1500, gailun) + "雷元素伤害");
                    withholdBlood(hurt(1500, gailun), gailun);
                    elementalReactions("雷", gailun);
                    return big;
                }else {
                    System.out.println("大招只能放一次请重新选择");
                    guanghui (guanghui,gailun, big);
                }
                break;
            case 5:
                guanghui.useDefensiveSkill();
                guanghui.setShields(500);//护盾不能叠加只能刷新
                guanghui.setDefensPower(guanghui.getDefensPower()*0.9);//减伤15%，多次使用乘算，会有稀释
                break;
            default:
                System.out.println("请输入正确选择");
                guanghui (guanghui,gailun, big);
                break;
        }
        return big;
    }

    /**
     * 盖伦战斗
     * @param gailun
     * @param guanghui
     */
    public static boolean gailun (Warrior gailun,Character guanghui,boolean big){
        System.out.println("选择盖伦的操作");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.普通物理攻击造成700点物理伤害" +"\t"+"\t"+"2.荒漠之咬 - 造成200点物理伤害并破除对方护盾");
        System.out.println("3.坚定之心 -收到伤害减少20%" +"\t"+"\t"+"\t"+"4.限定大招-德玛西亚正义 造成目标已损失生命值40%+500的真实伤害（无视减伤效果）");
        System.out.println("5.狂徒 回复20%最大生命值" );
        int tab = sc.nextInt();
        switch (tab){
            case 1:
                gailun.attack();
                System.out.println("实际对光辉造成"+hurt(700,guanghui)+"伤害");
                withholdBlood(hurt(700,guanghui),guanghui);
                break;
            case 2:
                gailun.Q();
                guanghui.setShields(0);//破除护盾-在伤害生效前
                System.out.println("实际对光辉造成"+hurt(200,guanghui)+"伤害");
                withholdBlood(hurt(200,guanghui),guanghui);

                break;
            case 3:
                gailun.defend();
                gailun.setDefensPower(gailun.getDefensPower()*0.8);//减伤30%，多次使用乘算，会有稀释
                break;
            case 4:
                if (big){
                    big=false;
                gailun.useUlitmate();
                System.out.println("实际对光辉造成"+(0.4*(3000-guanghui.getHealth())+500)+"真实伤害伤害!!!");
                withholdBlood((int) (0.4*(3000-guanghui.getHealth())+500),guanghui);
                return big;
                }
                else {
                        System.out.println("大招只能放一次请重新选择");
                        gailun (gailun,guanghui, big);
                    }

                break;
            case 5:
                gailun.useDefensiveSkill();
               if(gailun.getHealth()+800>4000){
                   gailun.setHealth(4000);
               }else {
                   gailun.setHealth(gailun.getHealth()+800);
               }
                break;
            default:
                System.out.println("请输入正确选择");
                gailun (gailun,guanghui, big);
                break;
        }
        return big;
    }
}
