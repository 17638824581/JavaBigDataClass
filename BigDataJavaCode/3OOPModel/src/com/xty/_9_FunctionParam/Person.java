package com.xty._9_FunctionParam;

/*
 *  提取出 Student 和 Teacher 中的共有的内容。
 *
 * */
public abstract class Person {

    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     *  抽象方法：睡觉
     * */
    public abstract void sleep();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
