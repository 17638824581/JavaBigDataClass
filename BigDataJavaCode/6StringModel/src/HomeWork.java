import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //1. 使用replace() 替换手机号中间的数字
        // 让用户输入手机号
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入您的手机号：");
//        String number = sc.nextLine();
//
//        // 使用StringBuilder替换中间的数字为 *
//        StringBuilder sb = new StringBuilder(number);
//        sb.replace(3,7,"****");
//
//        // 输出一下结果
//        System.out.println("您的手机号码："+number+"替换之后为："+sb);


        //2. 将一个完整的IP地址分解为 网段部分和 电脑编号部分
//        String ip = "192.168.33.44";
//        //获取最后一个 . 的索引位置
//        int index = ip.lastIndexOf(".");
//        System.out.println("网段部分："+ip.substring(0, index));
//        System.out.println("电脑编号："+ip.substring(index+1));

        //3. 判断输入的网址是否正确
        // 判断里面有没有  www 以及 .com

        // 首先输入网址
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个网址：");
//        String url = sc.nextLine();
//
//        // 判断网址是否正确
//        int index1 = url.indexOf("www");        // 在url中查找www的位置
//        int index2 = url.indexOf(".com");       // 在url中查找.com的位置
//
//        // 输出结果
//        if(index1 == -1 || index2 == -1){
//            System.out.println("网址不符合条件");
//        }else{
//            System.out.println("网址符合条件");
//        }

        //4. 截取手机号前三位和后四位并输出

        // 首先输入手机号
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入手机号：");
//        String number = sc.nextLine();
//        // 然后截取手机号
//        String qsw = number.substring(0,3);
//        String hsw = number.substring(number.length()-4);
//        // 打印结果
//        System.out.println("手机号前三位："+qsw);
//        System.out.println("手机号后四位："+hsw);

        //5. 截取qq邮箱中的qq号
//        String qqmail = "13245123@qq.com";
//        // 找到 @ 符号的索引
//        int index = qqmail.indexOf("@");
//        // 截取从 开头 到 索引位置 的字符串
//        System.out.println("qq邮箱"+qqmail+"的qq号是"+qqmail.substring(0,index));


    }

}
