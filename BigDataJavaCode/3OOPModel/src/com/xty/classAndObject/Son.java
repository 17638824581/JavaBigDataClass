package com.xty.classAndObject;

public class Son extends Father{

    public Son() {
    }

    public Son(String name, int age, double money) {
        super(name, age, money);
    }

    public void buy(String name) {
        super.use_buy(name);
        System.out.println("并且向收银员要了小票!");
    }

}
