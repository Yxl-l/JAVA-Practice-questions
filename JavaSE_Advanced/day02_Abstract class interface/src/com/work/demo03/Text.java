package com.work.demo03;

public class Text {
    public static void main(String[] args) {
        NewPhone n = new NewPhone();
        n.call();n.sms();n.game();
    OldPhone o = new OldPhone();
    o.call();o.game();o.call();
    }
}
