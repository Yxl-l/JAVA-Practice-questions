package com.yxl.demo01;

public class Text7 {
    public static void main(String[] args) {
        int a= 5;
        //初始a瓶，0瓶盖，0空瓶
        System.out.println("一共喝了"+beer(a,0,0));
    }
    private static int beer(int num,int q,int w) {
        int sum = num;//计数喝了的
        q=num+q; w=num+w;//更新瓶盖和瓶子
        num=q/4+w/2;//能换的瓶数
        q=q%4;//剩余的盖子
        w=w%2;//剩余的瓶子
        if (num==0){
            System.out.println("盖子还有"+q);
            System.out.println("瓶子还有"+w);
            return sum;
        }
         return sum+beer(num,q,w);
    }
}
