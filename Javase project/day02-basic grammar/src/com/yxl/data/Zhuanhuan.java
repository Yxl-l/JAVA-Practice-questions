package com.yxl.data;

public class Zhuanhuan {
    public static void main(String[] args) {
        int a = 10;
        long b = a;
       long v= a+b;
       double q=1548648676.614949448;
       double p=q+b;
        //运算过程中的类型转换：在表达式中，小范围类型的变量，会自动转换成表达式中较大范围的类型，再参与运算。
        // 注意1：表达式的最终结果类型由表达式中的最高类型决定在表达式中，

        byte C=100;
        short D=20;
        int num=C+D;
        //注意2：byte、short、char是直接转换成int类型参与运算的。

        int w= (int) q;
        byte l= (byte) D;
        System.out.println(w +"\t"+l);
//        强制类型转换，可能丢失数据、直接丢掉小数部分



        int students=30;
        double maxMathScore=60;
        double averageScore=50;
        double mathScoreRankings=1;
        /*
        * 1、一般由数字、字母、下划线（_）和美元符（$）等组成
        * 2、不能以数字开头，不能是关键字，不能包含一些特殊字符（&、%、#.）
        * 3、变量名：建议首字母小写，后面每个单词首字母大写，满足”小驼峰模式
        * 4、类名：建议所有单词首字母都大写，满足"大驼峰模式
        */

    }
}
