import java.util.Scanner;

public class CountChar {
    /*
    *
    *  统计输入的字符类型以及字符个数
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 创建一个扫描器对象，扫描键盘输入
        System.out.println("请输入一些内容：");
        String s = sc.nextLine();// 获取一行输入;

        int count_BigLetter = 0;        // 表示大写字母的个数
        int count_SmallLetter = 0;    // 表示小写字母的个数
        int count_Number = 0;           // 表示数字的个数


        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 判断 c 是什么类型的字符
            if(c >= 65 && c <= 90){
                count_BigLetter ++;
            }else if(c>= 97 && c<=122){
                count_SmallLetter++;
            }else if(c>=48 && c<=57){
                count_Number++;
            }

        }

        // 输出结果
        System.out.println("您输入的字符串中，有"+count_Number+
                "个数字，有"+count_BigLetter+"个大写字母，有"+
                count_SmallLetter+"个小写字母！");

    }
}
