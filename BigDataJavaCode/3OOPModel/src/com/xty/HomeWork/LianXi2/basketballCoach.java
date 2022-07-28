package com.xty.HomeWork.LianXi2;

/*
 *  篮球教练类，继承了教练类
 *
 * */
public class basketballCoach extends Teacher {

    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("篮球教练吃了" + food + "饭");
    }

    @Override
    public void train() {
        System.out.println("篮球教练开始教学训练");
    }
}
