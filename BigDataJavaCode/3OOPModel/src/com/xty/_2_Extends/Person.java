package com.xty._2_Extends;

public class Person {
    public String name;
    public char sex;
    public int age;
    public double height;
    public double weight;

    public Person() {
    }

    public Person(String name, char sex, int age, double height, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void speak(){
        System.out.println("我叫"+this.name+"我是个"+this.sex+"人，我今年"+this.age+"岁");
    }
}
