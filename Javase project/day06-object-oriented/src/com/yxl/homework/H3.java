package com.yxl.homework;

import java.util.Scanner;

import static com.yxl.homework.BankAccount.totalAccounts;

public class H3 {
    public static void main(String[] args) {
       BankAccount[] ba= new BankAccount[100];
        Scanner  sc = new Scanner(System.in);
        for (;;) {
            System.out.println("请输入操作类型：注册、取款、退出");
            String type = sc.next();


            if (type.equals("注册")) {
                int totalAccounts = BankAccount.totalAccounts;
                System.out.println(totalAccounts);
                ba[BankAccount.totalAccounts] = new BankAccount(25.6);//用户数组创建
                System.out.println(ba[totalAccounts].getId()+"用户创建成功");

                System.out.println("恭喜你注册成功,您的账号是"+ba[totalAccounts].getId()+"当前余额：" + ba[totalAccounts].getBalance());//打印创建完成后账号余额
                continue;

            } else if (type.equals("取款")) {
                System.out.println("请输入账号id：");
                String idName = sc.next();
                for (int i = 0; i <totalAccounts; i++) {
                    //遍历数组，找到对应id的账号
                    if (ba[i].getId().equals(idName)) {
                        System.out.println("请输入取款金额：");
                        double money = sc.nextDouble();
                        ba[i].withdraw(money);
                        continue;
                    }
                    if (i == ba.length - 1) {
                        System.out.println("用户不存在");
                    }
                }
            } else if (type.equals("退出")) {
                System.out.println("欢迎下次使用");
                break;
            }
            else {
                System.out.println("输入有误，请重新输入");
            }

        }
    }
}
