package com.yxl.Case;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    //1创建保存菜品的ArrayList集合对象、创建Scanner扫描器
    // 2打印"欢迎来到黑马餐厅
    // 3在while死循环中打印菜单信息
    // 4获取用户的选择并判断1/5根据用户的选择执行对应的功能（调对应的方法）
    public static void main(String[] args) {
        ArrayList<Dishes> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------欢迎来到饭店----------------------------------------");
        System.out.println("请选择您的操作)");

        while (true) {
            System.out.println("1.上架菜品" + "\t" + "2.查询菜单" + "\t" + "3.删除菜品" + "\t" + "4.退出系统");
            String type = sc.next();
            switch (type) {
                case "1":
                    System.out.println("上架菜品");
                    //在开发中，一般时先调用方法，在反向生成方法（快捷键：aLt+enter--->Create method 'addDish' in）
                    addFood(list);
                    break;
                case "2":
                    System.out.println("查询菜单");
                    inquireFood(list);
                    break;
                case "3":
                    System.out.println("删除菜品");
                    deleteFood(list);
                    break;
                case "4":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    private static void deleteFood(ArrayList<Dishes> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的菜名");
        String name = sc.next();
        int cont = 0;
        for (int i = list.size() - 1; i >= 0; i--) {

            if(list.get(i).getName().equals(name)){
                list.remove(i);
                cont++;
                System.out.println("删除成功");
            }
        }
        if (cont ==0){
            System.out.println("没有此菜");
        }
    }

    /**
     * @param list
     * 查询菜品
     */
    public static void addFood(ArrayList<Dishes> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的菜名");
        String name= sc.next();
        Dishes dishes = new Dishes();
        dishes.setName(name);
        list.add(dishes);
        System.out.println("请输入价格");
        double price = sc.nextDouble();
        dishes.setPrice(price);
        System.out.println("请输入介绍");
        String introduce = sc.next();
        dishes.setIntroduce(introduce);

        System.out.println("添加成功");

    }
    /**
     * @param list
     * 查询菜品
     */
    public static void inquireFood(ArrayList<Dishes> list){
        if(list.isEmpty()){
            System.out.println("没有菜品请先上架菜品");
            return;
        }
        for (Dishes s : list){
            System.out.println(s);
        }
    }




}
