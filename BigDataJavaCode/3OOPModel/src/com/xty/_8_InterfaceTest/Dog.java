package com.xty._8_InterfaceTest;

/*
*  狗类，继承了动物类，实现了 游泳、打滚接口
* */
public class Dog extends Animal implements YouYong,DaGun {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void youyong() {
        System.out.println("狗狗开始狗刨游泳！");
    }

    @Override
    public void eat() {
        System.out.println("狗狗啃东西吃！");
    }

    @Override
    public void run() {
        System.out.println("狗狗跳着跑！");
    }

    @Override
    public void daGun() {
        System.out.println(this.name+"打滚！");
    }
}
