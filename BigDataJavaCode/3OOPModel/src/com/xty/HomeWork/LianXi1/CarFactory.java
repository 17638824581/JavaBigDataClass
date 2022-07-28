package com.xty.HomeWork.LianXi1;

public class CarFactory extends Factory {

    public CarFactory() {
    }

    public CarFactory(String name) {
        super(name);
    }

    @Override
    public void production() {
        System.out.println("生产" + this.name + "牌的小汽车。");
    }
}
