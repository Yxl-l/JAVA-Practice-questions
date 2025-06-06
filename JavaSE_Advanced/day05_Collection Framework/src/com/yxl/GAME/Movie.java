package com.yxl.GAME;

/**
 * 1.电影类

 */
public class Movie {
    private String name;
    private String director;
    private double score;
    private double money;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", score=" + score +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Movie(String name, String director, double score, double money) {
        this.name = name;
        this.director = director;
        this.score = score;
        this.money = money;
    }

    public Movie() {
    }
}
