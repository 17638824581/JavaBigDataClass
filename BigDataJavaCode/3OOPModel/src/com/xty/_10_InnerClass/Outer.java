package com.xty._10_InnerClass;

public class Outer {

    private static String s = "123";

    public Inner getInner() {
        return new Inner();
    }

    public void useInner() {
        Inner i = getInner();
        i.show();
    }

    static class Inner {
        public void show() {
            System.out.println(s);
        }
    }

    static class Inner2 {
        public void show() {
            System.out.println(s);
        }
    }

    static class Inner3 {
        public void show() {
            System.out.println(s);
        }
    }
}



