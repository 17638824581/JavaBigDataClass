package com.xty._1_classAndObject;

public class TomCat extends Cat {

//    public int age = 99;

    public TomCat() {
    }

    public TomCat(String name, String color, int age) {
        super(name, color, age);
    }

    /*抓老鼠*/
    public void catchMouse(){
        System.out.println(this.name+"抓到了只大老鼠！");
    }
}
