package com.xty.FinalTest;

import com.xty.Test3.B;

public class A{
    // 当要把一个变量设置为常量的时候，必须给值
    public String name = "张三";  //常量：不可变的量

    public final void method1(){
        System.out.println("A类中的method1方法");
    }
}
