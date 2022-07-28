package com.xty._8_InterfaceTest;

public class SanXiangBiSai {
    public static void main(String[] args) {

        // 1.创建一个实现了 SanXiang 接口的对象
        ChongZi chongZi = new ChongZi();
        readyGo(chongZi);

        // 2. 匿名内部类（不想专门写一个 实现/继承 的类）
        readyGo(new SanXiang() {
            @Override
            public void youyong() {
                System.out.println("鱼游泳");
            }

            @Override
            public void fly() {
                System.out.println("鱼飞了");
            }

            @Override
            public void daGun() {
                System.out.println("鱼打滚");
            }
        });
    }

    public static void readyGo(SanXiang sx) {
        System.out.println("----开始三项比赛---");
        System.out.println("第一项：游泳");
        sx.youyong();
        System.out.println("第二项：打滚");
        sx.daGun();
        System.out.println("第三项：飞翔");
        sx.fly();
    }
}
