package com.xty._7_AbstractClass;

public class HaShiQiDog extends Dog{
    public HaShiQiDog() {
    }

    public HaShiQiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void crow() {
        System.out.println("嗷嗷啊！！");
    }


}
