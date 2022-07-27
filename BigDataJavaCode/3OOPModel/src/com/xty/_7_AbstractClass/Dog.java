package com.xty._7_AbstractClass;

public abstract class Dog extends Animal{

    public String name;

    public Dog() {
    }

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("狗狗咬着吃东西！");
    }

}
