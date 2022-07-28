package com.xty.HomeWork.LianXi2;

/*
 *  抽象类，运动员类，继承人类，有自己的抽象方法
 * */
public abstract class SportsMan extends Person {

    public SportsMan() {
    }

    public SportsMan(String name, int age) {
        super(name, age);
    }

    // 学习的抽象方法
    public abstract void study();
}
