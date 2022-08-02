package com.xty.HomeWork.Test;

@ZhuJie
public class Student {
    public String name;
    public String sex;

    public Student() {
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void speak() {
        System.out.println("我叫" + this.name + "我是个" + sex);
    }
}
