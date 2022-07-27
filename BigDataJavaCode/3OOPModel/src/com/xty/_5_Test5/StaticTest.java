package com.xty._5_Test5;

public class StaticTest {

    // 属性是写在 类里面 方法外面 的
    public String name = "张三";          // 没有static 修饰的是 对象属性
    public static String name2 = "李四";  // 被 static 修饰的 是 类属性

    // 写一个对象方法
    public void printName(){
        System.out.println(this.name);
        System.out.println(this.name2);
    }

    // 写一个静态(类)方法
    public static void main(String[] args){
        System.out.println(name2);
    }


}
