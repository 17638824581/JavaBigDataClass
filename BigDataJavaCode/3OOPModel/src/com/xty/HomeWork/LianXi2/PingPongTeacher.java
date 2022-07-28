package com.xty.HomeWork.LianXi2;

/*
 *  乒乓球教练类，继承了教练类，实现了English接口
 *
 * */
public class PingPongTeacher extends Teacher implements English {
    public PingPongTeacher() {
    }

    public PingPongTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球教练学习英语中");
    }

    @Override
    public void eat(String food) {
        System.out.println("乒乓球教练吃了" + food + "饭");
    }

    @Override
    public void train() {
        System.out.println("乒乓球教练开始教学训练");
    }
}
