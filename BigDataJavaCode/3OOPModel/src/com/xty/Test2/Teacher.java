package com.xty.Test2;

public class Teacher extends Person {

    public String prosession;

    public Teacher() {
    }

    public Teacher(String name, char sex, int age, double height, double weight) {
        super(name, sex, age, height, weight);
    }

    public Teacher(String name, char sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void speak() {
        System.out.println("我是"+this.prosession+"专业的老师，我叫"+this.name+"我今年"+this.age);
    }
}
