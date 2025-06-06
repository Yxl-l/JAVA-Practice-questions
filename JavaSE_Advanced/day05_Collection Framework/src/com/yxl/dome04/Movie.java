package com.yxl.dome04;

public class Movie {

    private String name;
    private String people;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", people='" + people + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Movie(String name, String people) {
        this.name = name;
        this.people = people;
    }

    public Movie() {
    }
}
