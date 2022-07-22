public class TestMethodReload {
    // 定义一个方法，这个方法接收两个 整数，返回这两个整数 之和
    public static int add(int a, int b){
        return a+b;
    }

    // 定义一个比较两个数是否相同的函数
    public static boolean compare(int i, int j){
        return i == j;
    }

    public static boolean compare(long i, long j){
        return i == j;
    }

    public static boolean compare(double i, double j){
        return i == j;
    }

    // 方法的参数传递问题
    public static void method(int vlaue){
        vlaue = 0;
    }

    public static void method2(int[] value){
        value[0] = 99;
    }

    // 写一个方法，这个方法接收一个数组，返回这个数组的字符串表达形式。
    public static String arrayToString(int[] arr){

        String arrString = "[";

        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                arrString += arr[i];
            }else{
                arrString += arr[i]+", ";
            }
        }
        arrString+="]";

        return arrString;
    }

    //方法用于获取数组中元素的最大值
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {12,888,56,321,548,55};

        int max = getMax(a);
        System.out.println(max);

    }
}
