package com.xty.HomeWork.LianXi1;

public class ShoesFactory extends Factory {

    public ShoesFactory() {
    }

    public ShoesFactory(String name) {
        super(name);
    }

    @Override
    public void production() {
        System.out.println("生产" + this.name + "牌的鞋子。");
    }
}
