package com.xty.Test4;

import com.xty.Test3.A;

/*
*  C 类 相对于 Test3 包中 的A 类 算 不同包中的子类
*
*
* */
public class C extends A  {

    public void printA(){
        System.out.println(this.num1);
        System.out.println(this.num2);
    }
}
