package com.xty.Test1;

public class Cat {

    public String name;
    public String color;
    public int age;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void crow(){
        System.out.println(this.name+"开心的叫了起来~喵喵~");
    }

    public void eat(String food){
        System.out.println(this.name+"吃了"+food);
    }

    public void printMess(){
        System.out.println("这是一只"+this.color+"色的猫，名字叫"+this.name+"，它今年"+this.age+"岁了！");
    }
}
