package com.xty._5_Test3;

/*
*   B 类相对与 A 类来说 算 同一个包下的 子类
*
* */
public class B extends A{

    public void PrintA(){
        System.out.println(this.num1);
        System.out.println(this.num2);
        System.out.println(this.num3);

        System.out.println(this);
    }
}
