package com.xty._3_FinalTest;

public class TestA {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);

        // final 关键字
        // 对属性使用：会见属性/变量 变为常量，常量不可改变，并且必须给值
        // 对方法使用：会声明为方法为最终方法，那么这个方法不可被重写
        // 对类使用：会声明这个类为最终类，这个类就不能被继承，但是可以继承其他类

        B b = new B();

        b.method1();
    }
}
