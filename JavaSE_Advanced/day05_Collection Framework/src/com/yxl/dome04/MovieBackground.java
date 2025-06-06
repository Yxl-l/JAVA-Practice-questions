package com.yxl.dome04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieBackground {
    ArrayList<Movie> movies = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void goMovie (){
        while (true){
            System.out.println("电影系统===========");
            System.out.println("1.上架");
            System.out.println("2.查询");
            System.out.println("3.删除");
            System.out.println("4.展示");
            System.out.println("5.退出");
            System.out.println("选择操作");
            String ty = sc.next();
            switch (ty){
                case "1":
                    addMovie();
                    break;
                case "2":
                    searchMovie(movies);
                    break;
                case "3":
                    deleteMovie(movies);
                    break;
                case "4":
                    break;
                case "5":
                   return;
                default:
                    break;
            }



        }
    }

    private void deleteMovie(ArrayList<Movie> movies) {
        System.out.println("请输入电影名子");
        String name = sc.next();
        int a= movies.size();
        movies.removeIf(s->s.getName().equals(name));
        if (a== movies.size()){
            System.out.println(name + "不存在，删除失败！");
        }else {
            System.out.println(name+"删除成功");
        }

//        Iterator<Movie> it = movies.iterator();
//        int cont=0;
//        while (it.hasNext()){
//            if (it.next().getName().equals(name)){
//                System.out.println(name+"删除成功");
//                cont++;
//            }
//        }
//        if (cont==0){
//            System.out.println("没有查询到该电影");
//        }


    }

    private void searchMovie(ArrayList<Movie> movies) {
        System.out.println("请输入电影名子");
        String name = sc.next();
        int cont=0;
        for (Movie movie : movies) {
            if (movie.getName().equals(name)){
                System.out.println("查询到电影");
                System.out.println(movie);
                cont++;
            }
            if (cont==0){
                System.out.println("没有查询到该电影");
            }
        }
    }

    private void addMovie() {
        System.out.println("请输入电影名子");
        String name = sc.next();
        System.out.println("亲输入电影导演名子");
        String people = sc.next();
        movies.add(new Movie(name,people));
        System.out.println("添加成功");
    }

}
