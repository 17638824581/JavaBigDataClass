package com.xty.Extends;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, char sex, int age, double height, double weight) {
        super(name, sex, age, height, weight);
    }

    public Student(String name, char sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void speak() {
        System.out.println("我是个学生，我叫"+this.name+"我今年"+this.age+"岁");
    }
}
