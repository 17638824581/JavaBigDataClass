import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*
*   一个模拟登录的小程序
*
* */
public class LoginDemo {
    public static void main(String[] args) {
        String username = "admin"; // 表示已经注册的用户名
        String password = "123456"; // 表示这个用户对应的密码

        // 模拟登录
        // 输入账号
        System.out.println("欢迎使用xx系统，请输入您的账号:");
        // 获取键盘输入内容
        Scanner sc = new Scanner(System.in);       // 1. 创建一个扫描器对象，扫描 System.in（系统标准输入（键盘输入））
        String uname = sc.nextLine();                   //2. 使用扫描器扫描一行输入

        for (int i = 0; i < 3; i++) {
            // 输入密码
            System.out.println("请输入密码：");
            String psd = sc.nextLine();                   //2. 使用扫描器再扫描一行输入

            // 验证密码和账号是否正确
            if(uname.equals(username) && psd.equals(password)){
                System.out.println("登录成功！");
                break;
            }else{
                if(i==2){
                    System.out.println("连续输入错误密码3次，账号锁定！");
                }else{
                    System.out.println("密码或账号错误，请重试！");
                }
            }
        }
    }
}
