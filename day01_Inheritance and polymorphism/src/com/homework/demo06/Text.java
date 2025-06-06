package com.homework.demo06;


import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("选择要办的卡：金卡，银卡,按其他键退出");
            String tp = scanner.next();
            switch (tp) {
                case "金卡":
                    System.out.println("请输入车牌");
                    String id = scanner.next();
                    System.out.println("请输入姓名");
                    String name = scanner.next();
                    System.out.println("请输入电话");
                    String phone = scanner.next();
                    System.out.println("请输入存款金额（最少为5000");
                    double balance = scanner.nextDouble();
                    Gold gold = new Gold(id, name, phone, balance);
                    System.out.println("办卡成功" + "车牌" + gold.getCartId() + "\t" + "姓名" + gold.getName() + "\t" + "电话" + gold.getPhone() + "\t" + "余额" + gold.getBalance());
                    System.out.println("请输入消费金额");
                    double num = scanner.nextDouble();
                    gold.consumption(num, gold.getBalance());
                    System.out.println("请输入充值金额");
                    double cont = scanner.nextDouble();
                    gold.go(cont);
                    break;
                case "银卡":
                    System.out.println("请输入车牌");
                    String id1 = scanner.next();
                    System.out.println("请输入姓名");
                    String name1 = scanner.next();
                    System.out.println("请输入电话");
                    String phone1 = scanner.next();
                    System.out.println("请输入存款金额（最少为2000");
                    double balance1 = scanner.nextDouble();
                    Silver gold1 = new Silver(id1, name1, phone1, balance1);
                    System.out.println("办卡成功" + "车牌" + gold1.getCartId() + "\t" + "姓名" + gold1.getName() + "\t" + "电话" + gold1.getPhone() + "\t" + "余额" + gold1.getBalance());
                    System.out.println("请输入消费金额");
                    double num1 = scanner.nextDouble();
                    gold1.consumption(num1, gold1.getBalance());
                    System.out.println("请输入充值金额");
                    double cont1 = scanner.nextDouble();
                    gold1.go(cont1);
                    break;
                default:
                    return;
            }
        }
    }
}
