package com.xty._6_DuoTai;

/*
*   动物类
*
*
* */
public class Animal {
    public String name;
    public int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(this.name+"吃了"+food);
    }

}
