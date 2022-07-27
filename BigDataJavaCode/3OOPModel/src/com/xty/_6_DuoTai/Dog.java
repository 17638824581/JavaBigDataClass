package com.xty._6_DuoTai;

/*
*   狗类
* */
public class Dog extends Animal{

    public String name;
    public String pinZhong;

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, String pinZhong) {
        super(name, age);
        this.pinZhong = pinZhong;
    }

    public void lookDoor(){
        System.out.println(super.name+"在看门!");
    }

    @Override
    public void eat(String food) {
        System.out.println(super.name+"啃了"+food);
    }

}
