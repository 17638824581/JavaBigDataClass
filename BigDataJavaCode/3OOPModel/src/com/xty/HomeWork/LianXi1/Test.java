package com.xty.HomeWork.LianXi1;

public class Test {
    public static void main(String[] args) {

        CarFactory cf = new CarFactory("广西柳州五菱宏光");
        cf.production();

        ShoesFactory sf = new ShoesFactory("河南耐克");
        sf.production();

        /*
         *   多态对象：父类引用子类对象
         *       方法：编译看父类，运行看子类
         *       属性：编译看父类，运行看父类
         * */

        Factory f = new CarFactory("雅迪");
        f.production();


    }
}
