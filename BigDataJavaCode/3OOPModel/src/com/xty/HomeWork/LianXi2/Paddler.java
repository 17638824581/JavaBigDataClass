package com.xty.HomeWork.LianXi2;

/*
 *  实体类，乒乓球运动员类，继承了运动员类，实现English接口
 *
 * */
public class Paddler extends SportsMan implements English {

    public Paddler() {
    }

    public Paddler(String name, int age) {
        super(name, age);
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }

    @Override
    public void eat(String food) {
        System.out.println("乒乓球运动员吃了" + food + "饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员练习乒乓球");
    }
}
