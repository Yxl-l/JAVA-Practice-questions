package com.yxl.GAME;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieBackground {
    public ArrayList <Movie> movies = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void goMovie(){
        while (true) {
            System.out.println("================================");
            System.out.println("1.上架电影");
            System.out.println("2.查询电影");
            System.out.println("3.下架电影");
            System.out.println("4.显示所有电影");
            System.out.println("5.封杀明星");
            System.out.println("6.修改电影");
            System.out.println("7.退出系统");
            System.out.println("请选择操作");
            String input = sc.next();
            switch (input){
                case "1":
                    addMovie();
                    break;
                case "2":
                    queryMovie(movies);
                    break;
                case "3":
                    deleteMovie(movies);
                    break;
                case "4":
                    showMovie(movies);
                    break;
                case "5":
                    blockedMovie(movies);
                    break;
                case "6":
                    modifyMovie(movies);
                    break;
                case "7":
                    return;
                default:
                {
                    System.out.println("别乱输入");
                }
                    break;


            }




        }

    }

    private void modifyMovie(ArrayList<Movie> movies) {
        System.out.println("请输入要修改的电影名");
        String movieName = sc.next();
        for (Movie movie : movies){
            if (movie.getName().equals(movieName)){
                System.out.println("请输入电影名");
                movie.setName(sc.next());
                System.out.println("请输入主演名子");
                movie.setDirector(sc.next());
                System.out.println("请输入评分");
               movie.setScore(sc.nextDouble());
                System.out.println("请输入票价");
                movie.setMoney(sc.nextDouble());

                System.out.println("电影《 "+movieName+" 》修改成功");
                System.out.println(movie);
            }
        }
    }

    private void blockedMovie(ArrayList<Movie> movies) {
        System.out.println("请输入封杀演员");
        String movieName = sc.next();
        int cont=0;
        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()){
            if (it.next().getDirector().equals(movieName)){
                it.remove();
                System.out.println("电影"+movieName+"删除成功");
                cont++;
            }
        }
        if (cont==0){
            System.out.println("为查询到该演员的电影");
        }

    }

    private void showMovie(ArrayList<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private void deleteMovie(ArrayList<Movie> movies) {
        System.out.println("请输入电影名");
        String movieName = sc.next();
        int cont=0;
        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()){
            if (it.next().getName().equals(movieName)){
                it.remove();
                System.out.println("电影"+movieName+"删除成功");
                cont++;
            }
        }
        if (cont==0){
            System.out.println("为查询到该演员的电影");
        }

    }

    private void queryMovie(ArrayList<Movie> movies) {
        System.out.println("请输入电影名");
        String movieName = sc.next();
        int cont=0;
        for (Movie movie : movies){
            if (movie.getName().equals(movieName)){
                System.out.println("查找到该电影");
                System.out.println(movie);
                cont++;
            }

        }
        if (cont==0){
            System.out.println("为查询到该演员的电影");
        }

    }

    private void addMovie() {
        System.out.println("请输入电影名");
        String movieName = sc.next();
        System.out.println("请输入主演名子");
        String directorName = sc.next();
        System.out.println("请输入评分");
        double score = sc.nextDouble();
        System.out.println("请输入票价");
        double money = sc.nextDouble();
        movies.add(new Movie(movieName,directorName,score,money));
        System.out.println("电影《 "+movieName+" 》添加成功");
    }



}
