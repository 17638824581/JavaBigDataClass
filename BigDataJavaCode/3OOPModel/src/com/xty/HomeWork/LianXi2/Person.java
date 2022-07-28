package com.xty.HomeWork.LianXi2;

/*
 *  抽象类，人类
 *
 * */
public abstract class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(String food);
}
