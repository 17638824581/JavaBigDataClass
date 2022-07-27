package com.xty._8_InterfaceTest;

/*游泳比赛*/
public class YouYongBiSai {

    /* 让动物开始游泳，限制会游泳的动物来 */
    public static void startSwim(YouYong yy){
        yy.youyong();
    }


    public static void main(String[] args) {

        /*创建动物选手*/
        Dog d = new Dog("小哈", 2);
        Cat c = new Cat("加菲", 1);
        Pig p = new Pig("佩奇", 2);

        System.out.println("开始比赛！");
        startSwim(d);
        startSwim(c);
        startSwim(p);


    }
}
