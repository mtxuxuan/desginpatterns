package com.xuxuan.createModle.factory;

public class MailSender implements sender {
    @Override
    public void send() {
        System.out.println("this   is  mailSender");
    }
}
