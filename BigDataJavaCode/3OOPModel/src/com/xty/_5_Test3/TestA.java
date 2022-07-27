package com.xty._5_Test3;

/*
*  TestA类相对于 A类，同一个包下的无关类
*
* */
public abstract class TestA {
    public static void main(String[] args) {
        // 创建A类的对象
        A a = new A();

        System.out.println(a.num1);
        System.out.println(a.num2);
        System.out.println(a.num3);


    }
}
