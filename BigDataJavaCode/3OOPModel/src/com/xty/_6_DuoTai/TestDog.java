package com.xty._6_DuoTai;

public class TestDog {
    public static void main(String[] args) {

        // 创建一个Animal的对象
//        Animal animal = new Animal("八爪鱼",2);
//        animal.eat("水草");
//
//        // 创建一个Dog的对象
//        Dog dog = new Dog("小黑", 2, "哈士奇");
//
//        dog.eat("骨头");
//        dog.lookDoor();
//
//        // Dog类继承了 Animal类，Dog就有了Animal中的东西，
//        // Animal类没有 Dog自己的东西
//
//        // Dog 是不是 Animal —— 》 Dog 继承了 Animal —— 》 Dog 能不能当成 Animal 去用
//        // Animal 是不是 Dog  ——》
//
//        //创建了 Dog 的引用            // 创造了 Dog 的对象
//        Dog d =  new Dog("小白",3,"萨摩耶");
//
//        //创建 Animal 的引用             // 创建 Dog 的对象
//        Animal a =  new Dog("小白",3,"萨摩耶");
//
//        // 把 a 当成Animal
//        // 子类对象被父类引用，只能访问父类中有的属性、方法，但是实际运行时，用的是子类的代码。
//        System.out.println(a);
//        System.out.println(a.name);
//        a.eat("香肠");
////
//
//        // a 原本就是Dog对象，被Animal引用了，现在再将 a 恢复为Dog
//        Dog dd = (Dog) a;
//        System.out.println(dd.pinZhong);
//
//        // 创建一个 Animal对象，将它转换为 Dog
//        Dog ddd = (Dog) new Animal("草泥马",1);

        // 对于方法来说：编译看左边(父类)，运行看右边(子类重写)
        // 对于成员变量来说：编译看左边(父类)，运行也看左边(父类)
//        Dog d = new Dog();
//        Animal a = new Animal();
//        System.out.println(d.name);
//        System.out.println(a.name);
//
//        Animal dd = d;
//
//        Dog ddd = (Dog) dd;
//
//        System.out.println(dd.name);
//        System.out.println(ddd.name);

        // 多态在方法参数列表中用的多

//        Dog dog = new Dog("小白",2,"萨摩耶");
//
//        Animal a = new Animal("草泥马",1);
//        Cat c = new Cat("小黑", 2);
//
//        // 很常用的例子
//        System.out.println();

    }

//    /*
//    *   喂食方法
//    *
//    * */
//    public static void feed(Animal d, String food) {
//        d.eat(food);
//    }

    // 写一个方法去接收任何类型的对象
//    public static void method(Object o){
//        System.out.println(o.getClass());
//    }

}
