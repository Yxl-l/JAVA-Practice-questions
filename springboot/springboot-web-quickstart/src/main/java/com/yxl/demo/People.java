package com.yxl.demo;

public class People {
    public int id ;
    public String name ;
    public String image;
    public  int gender;
    public  int job;

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", gender=" + gender +
                ", job=" + job +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public People(int id, String name, String image, int gender, int job) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.job = job;
    }


}
