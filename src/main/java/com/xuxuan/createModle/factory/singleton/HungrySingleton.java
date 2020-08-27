package com.xuxuan.createModle.factory.singleton;


/**
 * 饿汉式单例模式
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    // 私有化构造方法
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }


}
