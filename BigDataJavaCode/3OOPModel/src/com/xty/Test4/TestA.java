package com.xty.Test4;


import com.xty.Test3.A;

/*
*  TestA 类相对于 Test3包中的 A 类来说，算不同包中的无关类
*
* */
public class TestA {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.num1);
    }
}
