package com.xty.StaticTest;

public class StaticAndFinal {
    public static void main(String[] args) {


        // 对象属于/非静态属性/实例属性
        // 必须通过 类的对象 访问
//        A a1 = new A();
//        A a2 = new A();

//        A.method2();
//        a1.method2();

//        // name2 是 类属性，静态属性，这些属性是所有对象共享的。
//        a1.name2 = "王五";
//        System.out.println(a1.name2);
//        System.out.println(a2.name2);
//
//        // name 属性是 对象属性/非静态属性，这些属性是对象 自己的。
//        a1.name = "李四";
//        System.out.println(a1.name);
//        System.out.println(a2.name);


        // 类属性/静态属性 可以直接通过 类名访问
//        System.out.println(A.name2);


        // 1. static 关键字

        // 用在属性上：
        //  属性就变为类属性/静态属性，可以通过类名直接访问
        //  类属性，在所有对象中通用

        // 用方法上：
        //  方法就变为 类方法/静态方法，可以通过类名直接访问
        //  类方法，在所有对象中通用

        // 2. final 关键字
    }
}
