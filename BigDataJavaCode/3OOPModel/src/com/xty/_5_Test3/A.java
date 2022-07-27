package com.xty._5_Test3;

public class A {
    public int num1 = 10;       // 公开的
    protected int num2 = 20;    // 受保护的
    int num3 = 30;              // 默认权限
    private int num4 = 40;      // 私有的

    public void method1(){
        System.out.println("我是A类中的公开方法");
    }

    protected void method2(){
        System.out.println("我是A类中的受保护的方法");
    }

    void method3(){
        System.out.println("我是A类中默认权限的方法");
    }

    private void method4(){
        System.out.println("我是A类中私有的方法");
    }
}
