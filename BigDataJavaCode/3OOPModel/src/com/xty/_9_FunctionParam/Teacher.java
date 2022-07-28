package com.xty._9_FunctionParam;

public class Teacher extends Person implements Study {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }


    @Override
    public void sleep() {
        System.out.println(this.name + "开始休息！");
    }

    @Override
    public void study() {
        System.out.println("老师" + this.name + "开始备课！");
    }
}
