import java.util.ArrayList;


import java.util.function.Consumer;

/*
*
*   测试一些Java中常用的Api类
*   1. ArrayList
*
* */
public class ApiTest {


    public static void main(String[] args) {
        // 测试 ArrayList 类
        ArrayList<String> al = new ArrayList<>();

        // 添加元素
        al.add("张三");
        al.add("李四");
        al.add("王五");

        System.out.println(al);

        // 插入元素
        al.add(2, "马六");

        System.out.println(al);

        // forEach遍历
        al.forEach(ApiTest::print);

    }

    public static void print(String s){
        System.out.println("["+s+"]");
    }
}
