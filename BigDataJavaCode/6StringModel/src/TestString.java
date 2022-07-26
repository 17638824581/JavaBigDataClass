import java.io.UnsupportedEncodingException;

public class TestString {
    public static void main(String[] args) {
        // 1. 以基本数据类型创建的形式创建字符串
        // 视这个字符串为基本数据类型
//        String str1 = "abc";
//        String str2 = "abc";
//
//        System.out.println(str1 == str2);
//
//        // 2. 以String类构造方法创建字符串
//        String str3 = new String("abc");
//        String str4 = new String("abc");
//
//        System.out.println(str3);
//        System.out.println(str4);
//
//        // 比较字符串内容 用 equals() 方法
//        System.out.println(str3.equals(str4));
//        // 比较字符串内存地址 用 ==
//        System.out.println(str3 == str4);
//
//        // 3. 空参构造
//        String s5 = new String();
//        System.out.println(s5);
//
//        // 4. 使用 字节数组 创建字符串对象
//        byte[] b = {65, 66, 67, 68, 69, 70};
//        String s6 = new String(b);
//        System.out.println(s6);
//
//        // 5. 使用 int数组，创建字符串对象
//        int[] i = {19968, 19969, 19970, 19971, 19972, 19973};
//        String s7  = new String(i,0,6);
//
//        System.out.println(s7);
//
//        // 6. 使用 char[] 数组，创建字符串对象
//        char[] c = {'我','爱','你','中','国'};
//        String s8 = new String(c);
//        System.out.println(s8);
//
//        // 7. 使用 字节数组 创建 指定 字符集 字符串对象
//        byte[] b2 = {1, 2, 3, 4, 5, 6};
//        try {
//
//            String s9 = new String(b2,"ascii");
//            System.out.println(s9);
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        for (int j = 0xE101; j <= 0xE15A ; j++) {
//            System.out.println(new String(new int[]{j},0,1));
//        }
//
//
        // 8. String 的 charAt() 方法
//        String s = "ABCDEF";
//
//        // 遍历字符串
//        for (int i = 5; i >= 0; i--) {
//            char c = s.charAt(i);
//            System.out.println(c);
//        }

        // 9.compareToIgnoreCase()方法，忽略大小写比较两个字符串，若字符串内容一致，则返回 0
//        String s1 = "XTY";
//        String s2 = "xty";

//        System.out.println(s1.compareToIgnoreCase(s2));

        // 10.concat()方法，合并字符串

//        System.out.println((s1+s2).equals("XTYxty"));
//        s1 += s2;
//        s1 = s1.concat(s2);
//        System.out.println(s1);

        // 11. 字符串反转
//        String s = "ABCDEF";
//
//        String new_s = "";
//
//        // 遍历字符串
//        for (int i = 5; i >= 0; i--) {
//            char c = s.charAt(i);
//            new_s += c;
//        }
//
//        System.out.println(new_s);


        System.out.println("ABC"+"abc");


    }
}
