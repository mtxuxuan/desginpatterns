package com.xuxuan.createModle.factory.builder;

public class BuilderTest {

    public static void main(String[] args) {
        Director director=new Director();
        Product create = director.create(new BuilderEntity());
        System.out.println(create.toString());


    }
}
