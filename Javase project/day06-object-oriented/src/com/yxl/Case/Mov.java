package com.yxl.Case;

public class Mov {
    private String  name;
    private double Score;

    public Mov() {
    }

    public Mov(String name, double Score){
        this.name = name;
        this.Score = Score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }



    @Override
    public String toString() {
        return "Mov{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
