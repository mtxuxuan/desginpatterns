package com.xuxuan.createModle.factory.singleton;

/*
懒汉单例模式 双重校验锁线程安全
 */

public class singleton {
    //2.本类内部创建对象实例
    private static singleton instance = null;

    /**
     * 1.构造方法私有化，外部不能new
     */
    private singleton() {

    }

//3.提供一个公有的静态方法，返回实例对象

    public static singleton getInstance() {
        if (instance == null) {
            synchronized (singleton.class) {
                if (instance == null) {
                    instance = new singleton();
                }
            }

        }

        return instance;
    }


}
