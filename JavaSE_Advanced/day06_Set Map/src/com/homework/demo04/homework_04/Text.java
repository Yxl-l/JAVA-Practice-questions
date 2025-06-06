package com.homework.demo04.homework_04;

import java.util.HashSet;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入注册用户名");
            users.add(new User(sc.next()));
        }
    }
}
