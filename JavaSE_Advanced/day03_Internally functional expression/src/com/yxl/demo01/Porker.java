package com.yxl.demo01;

    public class Porker {
        public static String[] colors;
        public static String[] numbers;
        //54张扑克牌
        public String[] porkers;

        //静态代码块在类已加载的时候就执行,只会执行一次,一般静态变量的初始化
        static {  //静态代码块开始
            colors = new String[]{"红桃","黑桃","梅花","方片"};
            numbers = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        }   //静态代码块结束
        //示例代码块：普通代码块在创建对象的时候执行(先于构造方法),一般普通成员变量的初始化
        {   //实例代码块开始
            porkers = new String[54];
            int index = 0 ;
            for (int i = 0; i < colors.length; i++) {
                for (int i1 = 0; i1 < numbers.length; i1++) {
                    porkers[index] = colors[i]+numbers[i1];
                    index++;
                }
            }
            porkers[index++] = "大王";
            porkers[index++] = "小王";
        }  //实例代码块结束
        public String[] getPorkers() {
            return porkers;
        }
        public void setPorkers(String[] porkers) {
            this.porkers = porkers;
        }
    }

