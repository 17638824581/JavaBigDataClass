package com.xty._6_DuoTai;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println(super.name+"舔食了"+food);
    }

}
