package com.xuxuan.factory;

public class SmsSender  implements  sender{
    @Override
    public void send() {
        System.out.println("this is SmsSender");
    }
}
