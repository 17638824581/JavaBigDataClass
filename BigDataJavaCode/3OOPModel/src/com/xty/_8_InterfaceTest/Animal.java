package com.xty._8_InterfaceTest;

/*
*  动物抽象类，定义类动物通用 的属性和抽象方法
* */
public abstract class Animal {
    public String name;
    public int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void run();
}
