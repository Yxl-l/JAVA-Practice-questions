package com.work.demo05;

/**
 * 家电父类
 */
public abstract class  HomeAppliances implements Switch{
    //编号
    private int id;
    //家电名称
    private String name;
    //家电位置
    private String location;
    //家电状态 true 开 false 关
    private boolean status;

    public HomeAppliances(int id, String name, String location, boolean status) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.status = status;
    }

    @Override
    public void press() {
        status=!status;
        if (status){
            work();
        }

    }

    public abstract void work();

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
