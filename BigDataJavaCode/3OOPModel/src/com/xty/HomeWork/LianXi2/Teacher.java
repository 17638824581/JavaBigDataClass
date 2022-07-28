package com.xty.HomeWork.LianXi2;

/*
 *  抽象类，教练类，继承了人类，有自己的抽象方法，train(训练)方法
 * */
public abstract class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    // 教学的抽象方法
    public abstract void train();
}
