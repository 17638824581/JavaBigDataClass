package com.xty.test;

import java.util.ArrayList;

public class SystemTest extends Person {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
//
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = new int[10];
//
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//        // System.arraycopy()      复制数组元素
//        System.arraycopy(arr1,0,arr2,5,arr1.length);
//
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        // System.currentTimeMillis() 获取当前以毫秒为单位的时间 (时间戳) 从1970年1月1日0点0分0秒，到现在所过的时间
        // System.exit() 退出当前java程序

//        long stratTime = System.currentTimeMillis();
//
//        long num = 0;
//        for (int i = 0; i <= 100000; i++) {
//            if (i==100){
//                System.exit(-1);
//            }
//            for (int j = 0; j < 10000; j++) {
//                num += 1;
//                System.out.println(num);
//            }
//
//        }
//        System.out.println("程序循环了:"+num+"次");
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("程序耗费的时间为(毫秒)："+(endTime-stratTime));


        // 哈希码是通过一系列计算公式算出来的。
        // 同一个对象的 哈希码 一样


        ArrayList<Person> al = new ArrayList<>();

        al.add(new Person("tom", 20));
        al.add(new Person("jerry", 15));
        al.add(new Person("bob", 18));
        al.add(new Person("lucy", 27));
        al.add(new Person("sarry", 22));
        al.add(new Person("ali", 22));
        al.add(new Person("cc", 22));
        al.add(new Person("deli", 22));

        System.out.println("排序前：\n" + al);


        // 使用匿名内部类
//        al.sort(new Comparator<Person>(){
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.name.charAt(0) - o2.name.charAt(0);
//            }
//        });


        // 使用lambda表达式
//        al.sort((o1,o2)->{
//            return o1.name.charAt(0) - o2.name.charAt(0);
//        });


        // 使用方法引用 ::
//        al.sort(SystemTest::compareNames);


        System.out.println("排序后：\n" + al);


//        // 用冒泡排序进行排序，按照person对象的 age 属性排
//        for (int i = 0; i < ps.length-1; i++) {
//            for (int j = 0; j < ps.length - 1 - i; j++) {
//                if (ps[j].age > ps[j+1].age){
//                    Person p = ps[j];
//                    ps[j] = ps[j+1];
//                    ps[j+1] = p;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(ps));

    }

    public static int compareNames(Person p1, Person p2) {
        return p1.name.charAt(0) - p2.name.charAt(0);
    }

}
