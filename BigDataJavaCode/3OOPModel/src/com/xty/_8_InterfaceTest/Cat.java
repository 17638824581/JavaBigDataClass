package com.xty._8_InterfaceTest;

/*
*  猫类，继承了动物类，实现了游泳接口
* */
public class Cat extends Animal implements YouYong{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫猫舔东西吃");
    }

    @Override
    public void run() {
        System.out.println("猫猫走猫步！");
    }

    @Override
    public void youyong() {
        System.out.println("猫猫挣扎着游泳！");
    }
}
