public class ArrayTest {
    public static void main(String[] args) {

//        // 1. 存储一组相同类型数据
//
//        // 1.创建方式：在创建到的时候 就 赋值（静态创建方式）
//        String[] names = {"郭林","牛子毅","刘志城","段学懿"};
//
//        // 2.创建方式：先创建数组，再进行赋值（动态创建方式）
//        String[] names2 = new String[10];
//
//        System.out.println(names2[10]);
//
//        names2[0] = "郭林";
//        names2[1] = "牛子毅";
//        names2[2] = "张三";
//        names2[3] = "李四";
//        names2[4] = "王五";
//        names2[5] = "奥六";
//        names2[6] = "张奥";
//        names2[7] = "老刘";
//        names2[8] = "老六";
//        names2[9] = "王五";
//
////        // 遍历数组
////        for (int i = 0; i < names2.length; i++) {
////            System.out.println(names2[i]);
////        }
////
////        // foreach遍历
////        for (String n: names2){
////            System.out.println(n);
////        }

        // 基本数据类型
//        int a = 10;
//        int b = a;
//
//        a = 20;
//
//        System.out.println(a);
//        System.out.println(b);
//
        // 数组 引用数据类型

//        int[] arr = new int[3];
//
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//
//        System.out.println(arr);
//        System.out.println(arr[0]+","+arr[1]+","+arr[2]);
//
//        int[] arr2 = arr;
//
//        arr[2] = 50;
//
//        System.out.println(arr2);
//        System.out.println(arr2[0]+","+arr2[1]+","+arr2[2]);

//        int[] arr = new int[10];
//
//        arr[0] = 10;
//        arr[1] = 20;
        // 数组中存储的元素类型必须和数组类型相同


//        double[] score = {66.8, 105, 45.5, 9.9, 75.6, 68.9, 35.2, 99.9, 100, 60};
//
//        // 计算这些分数的总和
//        double sum = 0;
//        // 获取score中的最大值
//        double max = score[0];
//        // 获取score中的最小值
//        double min = score[0];
//
//        for (int i = 0; i < score.length; i++) {
//            sum += score[i];        // 将每个分数都加到 sum 中
//
//            // 每次遍历 都拿 score[i] 和 max 进行比较
//            // 当 score[i] > max ，就让 max = score[i]
//            if (score[i] > max) {
//                max = score[i];
//            }
//
//            // 每次遍历 都拿 score[i] 和 min 进行比较
//            // 当 score[i] < min ，就让 min = score[i]
//            if (score[i] < min) {
//                min = score[i];
//            }
//
//        }
//        System.out.println("总分：" + sum);
//        // 1.平均分数
//        System.out.println("平局分：" + sum / score.length);
//        // 2. 这里面最大的分数
//        System.out.println("最高分：" + max);
//        // 3. 这里面最小的分数
//        System.out.println("最低分：" + min);
        // 4.数组反转
//        // 1. 新建一个空白的数组，长度和原数组一致
//        double[] new_score = new double[score.length];
//        // 2. 倒着将原数组的元素，存储到新数组中
//        for (int i = score.length-1; i >= 0; i--) {
//            new_score[9-i] = score[i];
//        }

//        for (int i = 0; i < score.length/2; i++) {
//            double b = score[i];
//            score[i] = score[score.length-1-i];
//            score[score.length-1-i] = b;
//        }

        // 5.数组查找元素
//        int[] a = {10,15,19,87,35,16,25,48,32,14};

        // 判断一个元素 在不在 数组中
        // 判断 a 中有没有 50 这个元素
//        int num = 87;
//        boolean b = false;      // 使用 b 表示 元素存不存在
//        for (int i : a) {
//            if(i == num){
//                b = true;
//                break;
//            }
//        }
//        if (b == true){
//            System.out.println("数组中有"+num+"这个元素");
//        }else{
//            System.out.println("数组中没有"+num+"这个元素");
//        }

//        // 查找指定元素 在数组中的哪个位置
//        int num = 32;       // 查找指定的元素
//        // 保存索引
//        int index = -1;
//        for (int i = 0; i < a.length; i++) {
//            if(a[i] == num){
//                index = i;
//            }
//        }
//        // 输出结果
//        if(index==-1){
//            System.out.println("没有这个元素");
//        }else{
//            System.out.println("元素"+num+"在数组中的位置是:"+index);
//        }

        // 6.数组排序
//        int[] a = {15, 1547, 48, 95, 7, 21, 3, 6654, 8};
//
//        // 1. 冒泡排序法(从小到大)
//        for (int j = 0; j < a.length - 1; j++) {
//            // 执行一遍内层循环，排好一个最大的数
//            for (int i = 0; i < a.length - j - 1; i++) {
//                if (a[i] > a[i + 1]) {     // 如果前一个元素比后一个元素大，则互换位置
//                    int b = a[i];
//                    a[i] = a[i + 1];
//                    a[i + 1] = b;
//                }
//            }
//        }

        // 2. 选择排序法
//        for (int i = 0; i < a.length-1; i++) {
//
//            // 1. 找元素
//            int min_index = i;                              // 表示每次遍历找到的最小的那个元素的索引
//            for (int j = i+1; j < a.length ; j++) {         // 遍历未排序部分，找出最小的值
//                if (a[min_index] > a[j]){
//                    min_index = j;
//                }
//            }
//
//            // 2. 交换元素
//            int b = a[i];
//            a[i] = a[min_index];
//            a[min_index] = b;
//
//        }


        // 7.数组元素去重
//        int[] arr1 = {10, 20, 30, 50, 40, 30, 10, 20};
//        // arr2 存储重复元素的标记
//        int[] arr2 = new int[arr1.length];
//
//        // 遍历 arr1 如果有重复的 就把重复的元素 在 arr2 对应位置标记出来
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = i+1; j < arr1.length; j++) {
//                if (arr1[i] == arr1[j]){
//                    arr2[j] = 1;
//                }
//            }
//        }
//
//        // 统计在 arr2 中 有几个 1
//        int num = 0;
//        for (int i : arr2) {
//            if (i == 1){
//                num += 1;
//            }
//        }

        // 创建一个空白的数组，用于存储去重之后的元素
//        int[] new_arr = new int[arr1.length - num];
//
//        int index = 0;
//        // 将arr1 中 没有重复的元素 存到 new_arr
//        for (int i = 0; i < arr1.length; i++) {
//            if(arr2[i]==0){
//                new_arr[index] = arr1[i];
//                index++;
//            }
//        }
//
//        System.out.println("去重之前：");
//        // 打印结果
//        for (int i :
//                arr1) {
//            System.out.println(i);
//        }
//
//        System.out.println("去重之后：");
//        // 打印结果
//        for (int i :
//                new_arr) {
//            System.out.println(i);
//        }

        // 定义二维数组
        // 1. 静态初始化

//        String[][] arr = {
//                {"小明", "张三", null, null, null},
//                {null, null, "王五", null, null},
//                {null, null, null , "小光", null},
//                {null, "小美", null, null, null},
//                {null, null, null, null, "小张"}
//        };
//
//        // 2. 动态初始化
//        int[][] arr2 = new int[5][5];
//
//        for (int[] i: arr2) {
//            for (int j : i) {
//                System.out.print(j+", ");
//            }
//            System.out.println();
//        }
//
//        // 将每一列的数据改为对应的列号
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr2[i][j] = i;
//            }
//        }
//
//        System.out.println("改完后：");
//        // 遍历并打印二维数组的元素
//        for (int[] i: arr2) {
//            for (int j : i) {
//                System.out.print(j+", ");
//            }
//            System.out.println();
//        }



        // Arrays 类：提供了一些操作数组的方法



    }
}
