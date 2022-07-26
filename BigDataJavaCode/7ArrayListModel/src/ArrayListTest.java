import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        // 创建一个 ArrayList
        // <String> 指的是泛型，代表了 ArrayList 要存储数据类型
        ArrayList<String> al = new ArrayList<String>();

        // 1. add() 添加元素
        al.add("孙悟空");
        al.add("猪八戒");
        al.add("沙和尚");
        al.add("唐僧");
        al.add("白骨精");
        al.add("玉兔精");

        System.out.println(al);
        System.out.println(al.size());

        // 2. set() 修改元素
        al.set(3,"二郎神");

        System.out.println(al);
        System.out.println(al.size());

        // 3. remove() 根据索引删除并返回元素
        String name = al.remove(4);
        System.out.println(name+"被删除掉了！");

        System.out.println(al);
        System.out.println(al.size());

        // 4. remove() 根据元素值删除元素
        boolean b = al.remove("白骨精");
        System.out.println("是否删除成功："+b);

        System.out.println(al);
        System.out.println(al.size());

        // 5. get() 根据索引获取元素
        String s = al.get(4);
        System.out.println(s);

        System.out.println(al);
        System.out.println(al.size());

    }
}
