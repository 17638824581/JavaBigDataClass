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
//        startSwim(d);
//        startSwim(c);
//        startSwim(p);


        // 不写类，但还是要用这个方法
        // 不想写类但是还是想用这个方法

        // 匿名内部类，只用一次，用完即走
        startSwim(new YouYong() {
            @Override
            public void youyong() {
                System.out.println("跳着游泳！");
            }
        });

        // lambda 表达式  jdk1.8 新特性
        startSwim(() -> {
            System.out.println("飞着游泳！");
        });


    }
}
