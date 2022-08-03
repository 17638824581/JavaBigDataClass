import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int id = 0;
        while (true) {
            System.out.println("请输入您的账号（整数）：");
            try {
                id = new Scanner(System.in).nextInt();
                System.out.println(1123 / id);

                // 这个位置一定是没出错运行的代码
                break;

            } catch (Throwable e) {       // 捕获所有的(Throwable是所有错误Error和异常Exception的父类)异常

                e.printStackTrace();    // 打印错误的追溯信息

                // 出现异常运行的代码
                System.out.println("您账号输入有误！");

            } finally {
                // 不管出不出错都运行的代码
                System.out.println("输入完了！");
            }
        }

        System.out.println("您输入的账号为:" + id);


        //Exception 异常

        // 索引越界异常
//        int[] a = {1,2,3};
//        System.out.println(a[3]);

        // 空指针异常
/*        String s = null;
        System.out.println(s.length());*/

        // 除0异常
        /*System.out.println(10/0);*/

        // Error 错误

        // 栈溢出错误
//        method();


    }

    public static void method() {
        method();
    }
}
