package com.xty._4_StaticTest;

public class A {
    // 对象属性/实例属性
    public String name = "张三";

    // 加 static 的 属性就是 类属性/静态属性
    public static String name2 = "李四";


    // 对象方法，非静态方法
    public void method1(){
        System.out.println("我是对象方法，method1！");
    }

    // 类方法
    public static void method2(){
        System.out.println("我是类方法，method2！");
    }
}
