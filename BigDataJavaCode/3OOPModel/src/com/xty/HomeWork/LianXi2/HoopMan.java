package com.xty.HomeWork.LianXi2;

/*
 *   实体类，篮球运动员类，继承了运动员类
 * */
public class HoopMan extends SportsMan {

    public HoopMan() {
    }

    public HoopMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("篮球运动员吃" + food + "饭");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员练球");
    }
}
