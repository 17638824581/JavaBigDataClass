package com.xty._8_InterfaceTest;

/*
 *  猪类，继承了动物类，实现了 游泳接口
 *
 * */
public class Pig extends Animal implements YouYong {

    public String PinZhong;

    public Pig() {
    }

    public Pig(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猪猪拱着吃东西！");
    }

    @Override
    public void run() {
        System.out.println("猪突猛进的跑！");
    }

    @Override
    public void youyong() {
        System.out.println("猪猪泡水里游!");
    }
}
