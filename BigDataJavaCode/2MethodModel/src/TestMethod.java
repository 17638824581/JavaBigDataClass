public class TestMethod {

    // 1. 定义方法
    public static void method1(){
        System.out.println("我爱你");
    }

    // 定义一个方法，来打印出 两个数中的 较大数
    public static void method2(){
        int a = 30;
        int b = 10;

        // 比较a和b谁大
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    // 将method2升级为 带参数的方法
    public static void method3(int num1, int num2){
        int a = num1;
        int b = num2;

        // 比较a和b谁大
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    // 1. 写一个有参方法， 这方法接收一个double类型的参数，
    // 打印这个double类型的四舍五入取整数的结果
    public static void getInt(double d){
        if ((d - (int) d) * 10 >= 5){
            System.out.println(d+"四舍五入后的值为："+((int)d+1));
        }else{
            System.out.println(d+"四舍五入后的值为："+(int)d);
        }
    }

    // 写一个add方法，它接收两个整数，打印这两个整数 相加的结果
    public static int add(int a, int b){
        return a+b;
    }

    // 写一个 sub 方法，它接收两个整数，打印这两个整数 相减的结果
    public static int sub(int a, int b){
        return a-b;
    }

    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    public static int getMax(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void method4(){
        for (int i = 0; i < 10; i++) {
            if (i==5){
                return;             // 即使是 函数无返回值，我们也可以单独使用 return; 表示结束函数
            }
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        method4();
        System.out.println("method4执行完毕");
    }
}
