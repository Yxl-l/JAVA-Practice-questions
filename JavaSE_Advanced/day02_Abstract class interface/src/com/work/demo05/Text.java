package com.work.demo05;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        HomeAppliances [] arr = new HomeAppliances[]{
                new Air(1,"空调", "卧室", false),
                new TV(2,"电视", "客厅", false)
        };
        HomeAppliancesController home = new HomeAppliancesController(arr);
        home.showAll();
        Scanner sc=new Scanner(System.in);

        while (true){
            int h1= sc.nextInt();
            if (h1==0){
                break;
            }

       HomeAppliances homeAppliances=getById(arr, h1);
            if(homeAppliances==null){
                System.out.println("没有找到对应的设备");
                continue;
            }
            home.control(homeAppliances);
            home.showAll();
}
    }

    private static HomeAppliances getById(HomeAppliances[] arr,int h1) {
        for (HomeAppliances H : arr){
            if (H.getId()==h1){
                return H;
            }
        }
        return null;
    }
}
