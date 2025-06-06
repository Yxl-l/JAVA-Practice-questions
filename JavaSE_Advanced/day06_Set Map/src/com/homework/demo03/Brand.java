package com.homework.demo03;

public class Brand {
    private int id;
    private String color;
    private String score;

    public Brand(String score) {

    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Brand(int id, String color, String score) {
        this.id = id;
        this.color = color;
        this.score = score;
    }
}
