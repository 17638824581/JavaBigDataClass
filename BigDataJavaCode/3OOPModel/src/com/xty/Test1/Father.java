package com.xty.Test1;

public class Father extends Grandpa{

    public String name;
    public int age;
    public double money;


    public Father(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Father() {
    }

    private void buy(String name){
        System.out.println(this.name+"买了"+name);
    }

    public void use_buy(String name){
        this.buy(name);
    }


}
