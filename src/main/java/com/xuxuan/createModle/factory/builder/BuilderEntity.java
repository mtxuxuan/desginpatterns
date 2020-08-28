package com.xuxuan.createModle.factory.builder;

public class BuilderEntity extends Builder {
    private
    Product product;
    public BuilderEntity() {
        product = new Product();
    }

    @Override
    void bulidA() {
        product.setBuildA("地基");

    }

    @Override
    void bulidB() {
   product.setBuildB("钢筋工程");
    }

    @Override
    void bulidC() {
        product.setBuildC("铺电线 ");

    }

    @Override
    void bulidD() {
     product.setBuildD("粉刷");
    }

    @Override
    Product getProduct() {
         return product;
    }
}
