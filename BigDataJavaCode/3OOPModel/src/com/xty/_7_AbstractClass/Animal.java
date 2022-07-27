package com.xty._7_AbstractClass;

/*
*  动物类
*
* */
public abstract class Animal {

    /*类属性*/
    public String name;
    public int age;

    /* 构造方法 */
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void crow();
}
