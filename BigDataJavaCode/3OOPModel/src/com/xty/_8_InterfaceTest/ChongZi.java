package com.xty._8_InterfaceTest;

/*
*  虫子类，实现了三项接口（也就间接实现了 游泳、打滚、飞翔的接口）
* */
public class ChongZi implements SanXiang {
    @Override
    public void daGun() {
        System.out.println("虫子打滚");
    }

    @Override
    public void fly() {
        System.out.println("虫子飞");
    }

    @Override
    public void youyong() {
        System.out.println("虫子游泳");
    }
}
