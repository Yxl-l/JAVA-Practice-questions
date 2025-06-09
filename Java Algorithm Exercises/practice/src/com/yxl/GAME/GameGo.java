package com.yxl.GAME;



public class GameGo {
    public static void main(String[] args) {
        Mage guanghui = new Mage("光辉", 3000, 0, 100, 1.0,"无");
        Warrior gailun = new Warrior("盖伦", 4000, 0, 100, 1.0,"无");
        System.out.println("光辉手长，光辉先手攻击!");
        boolean guanghuiBig = true; boolean gailunBig = true;
        int cont = 1;
        while (true) {
            System.out.println("🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥回合数"+cont+++"🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥");
            if (API.hp(guanghui, gailun)){break;}
            guanghuiBig = API.guanghui(guanghui,gailun,guanghuiBig);
            if (API.hp(guanghui, gailun)){break;}
            gailunBig = API.gailun(gailun,guanghui,gailunBig);
            if (API.hp(guanghui, gailun)){break;}
            System.out.println("=============================================================================================================================================");

        }
        if (guanghui.getHealth()<=0){
            System.out.println("✨✨✨盖伦获胜✨✨✨");
        }else {
            System.out.println("✨✨✨光辉获胜✨✨✨");
        }


    }
}



