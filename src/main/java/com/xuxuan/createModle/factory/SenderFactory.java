package com.xuxuan.createModle.factory;

/*
创建型 工厂模式
 */
public class SenderFactory {
    public sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
