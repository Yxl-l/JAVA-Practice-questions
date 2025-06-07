package com.yxl;

import java.util.ArrayList;
import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("-----------------------------欢迎来到学生管理系统-------------------------");
        while (true) {
            System.out.println("1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.根据学号查询学生 6.批量删除学生 7.按其他任意键退出" + "\n"
                    + "请输入您的选择");
            String input = sc.next();
            switch (input) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("修改学生");
                    reviseStudent(list);
                    break;
                case "4":
                    System.out.println("查看学生");
                    viewStudent(list);
                    break;
                case "5":
                    System.out.println("根据学号查询学生");
                    inquireStudent(list);
                    break;
                case "6":
                    System.out.println("批量删除学生");
                    deleteBulkStudent(list);
                    break;
                case "7":
                    return;

                default:
                    System.out.println("请输入正确选项数字");
                    break;
            }
        }
    }
    private static void deleteBulkStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请按格式输入学生学号用,间隔：如（A001,A002,A003）");
        String[] arr = sc.next().split(",");
        for(String id:arr){
            System.out.println(id);
            dle_id(id,list);
        }
    }

    /**
     * 根据学号查询学生
     * @param list
     */
    private static void inquireStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        if (list.isEmpty()){
            System.out.println("系统没有学生请先添加学生");
            return;
        }
        int cont=0;
        String w=sc.next();
        for(Student student : list){
            if(student.getId().equals(w)){
                System.out.println(student);
                cont++;
            }
        }
        if (cont==0){
            System.out.println("没有查询到该学生");
        }
    }
    /**
     *显示所有学生和信息
     * @param list
     */
    private static void viewStudent(ArrayList<Student> list) {
        if(list.isEmpty()){
            System.out.println("系统没有学生，请先添加学生");
            return;
        }
        for(Student student : list){
            System.out.println(student);
        }
    }
    /**
     * 修改学生
     * @param list
     */
    private static void reviseStudent(ArrayList<Student> list) {
        if(list.isEmpty()){
            System.out.println("系统没有学生，请先添加学生");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号");
        boolean ex=false;
        String w=sc.next();
        for(Student student : list){
            if(student.getId().equals(w)){//查询是否有该学号的学生
                ex=true;
                while (true) {//修改学生界面
                    System.out.println("请选择要修改的信息"+"\t"+"1.学号 2.姓名 3.年龄 4.住址 5.返回主界面");
                    String typ = sc.next();
                    switch (typ){
                        case  "1":
                            System.out.println("请输入修改后的学号");
                            student.setId(sc.next());
                            break;
                        case  "2":
                            System.out.println("请输入修改后的姓名");
                            student.setName(sc.next());
                            break;
                        case  "3":
                            System.out.println("请输入修改后的年龄");
                            student.setAge(sc.nextInt());
                            break;
                        case  "4":
                            System.out.println("请输入修改后的住址");
                            student.setHome(sc.next());
                            break;
                        case  "5":
                            return;
                        default:
                            System.out.println("请正确输入选择");
                            break;
                    }
                }
            }
        }
        if(!ex){
            System.out.println("为查询到学生返回主界面");
        }


    }

    /**
     * 删除单个学生
     * @param list
     */
    private static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号");
        dle_id(sc.next(),list);
    }

    /**
     * 根据id删除学生
     * @param id
     * @param list
     */
    private static void dle_id(String id,ArrayList<Student> list) {

            if (list.removeIf(student -> student.getId().equals(id))) {
                /*
                这是 Collection 接口提供的一个方法，用于根据条件删除集合中的元素。
                它接受一个 Predicate（条件）作为参数，如果条件为 true，则删除对应的元素。
                student -> student.getId().equals(sc.next())
                这是一个 Lambda 表达式，用于定义删除条件。
                 */
                System.out.println("删除成功");

        }
    }
    private static void addStudent(ArrayList<Student> list) {
        Student student = new Student();
        list.add(student);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加学生的学号");
        while (true) {//
            String idq = sc.next();
            boolean a = list.stream()
                    .filter(s -> s.getId() != null) // 过滤掉 id 为 null 的学生
                     .anyMatch(s -> s.getId().equals(idq));
            /*
            list.stream(): 将 ArrayList<Student> 转换为一个流（Stream），以便进行流式操作。
            anyMatch(s -> s.getId().equals(id)):
            使用 anyMatch 方法检查流中是否有任何一个元素满足给定的条件。
            这里的条件是 s.getId().equals(id)，即判断学生的学号是否与用户输入的学号匹配。
             */
            if (a) {
                System.out.println("学号已经存在请重新输入");
            } else {
                System.out.println("添加成功");
                student.setId(idq);
                break;
            }
        }
        System.out.println("请输入要添加学生的姓名");
        student.setName(sc.next());
        System.out.println("请输入要添加学生的年龄");
        student.setAge(sc.nextInt());
        System.out.println("请输入要添加学生的住址");
        student.setHome(sc.next());
        System.out.println("添加成功");
    }

}
