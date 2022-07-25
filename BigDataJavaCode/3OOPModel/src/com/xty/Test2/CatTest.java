package com.xty.Test2;  // 声明当前类所在包中的位置

// 若要使用不同包中的类，需要导包
import com.xty.Test1.*;     // 代表导入 Test1包中的所有内容

public class CatTest {
    public static void main(String[] args) {
        // 使用Cat类
        Cat cat = new Cat("小黑", "黑", 3);
        Father f1 = new Father();

        cat.crow();

        System.out.println(f1.lastname);
    }
}
