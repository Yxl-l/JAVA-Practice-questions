package com.work.demo05;

public class HomeAppliancesController {
    private HomeAppliances[] appliances;
    public HomeAppliancesController(HomeAppliances[] appliances){
        this.appliances=appliances;
    }
    public void showAll(){
        for(HomeAppliances H : appliances){
            System.out.println("设备编号:"+H.getId()+",设备名称:"+H.getName()+",设备位置:"+H.getLocation()+",设备状态:"+(H.isStatus()?"开启":"关闭"));
        }
    }
    public void control(HomeAppliances appliance){
        //输出控制之间的设备状态
        System.out.println(appliance.getName()+"设备当前状态是:"+(appliance.isStatus()?"开启":"关闭"));
        //控制设备开关
        appliance.press();
        //输出控制之后的设备状态
        System.out.println(appliance.getName()+"设备当前状态是:"+(appliance.isStatus()?"开启":"关闭"));
    }

}
