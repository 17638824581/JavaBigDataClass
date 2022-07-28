package com.xty.HomeWork.LianXi1;

/*
 *  抽象工厂类
 * */
public abstract class Factory {
    public String name;

    public Factory() {
    }

    public Factory(String name) {
        this.name = name;
    }

    // 抽象的生产方法
    public abstract void production();
}
