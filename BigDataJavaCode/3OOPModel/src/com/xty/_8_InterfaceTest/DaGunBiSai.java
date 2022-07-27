package com.xty._8_InterfaceTest;

/*
*  打滚比赛
* */
public class DaGunBiSai {

    /*让动物开始打滚*/
    public static void startDaGun(DaGun dg){
        dg.daGun();
    }

    public static void main(String[] args) {
        Dog d = new Dog("哈士奇", 2);

        System.out.println("开始打滚！");
        startDaGun(d);
    }
}
