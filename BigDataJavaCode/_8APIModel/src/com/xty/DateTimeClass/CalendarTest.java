package com.xty.DateTimeClass;

/*
 *  测试 Calendar类（日历类）
 *
 * */

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {

        // 计算任意年份的二月有多少天
        // 让用户输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要查询的年份：");
        int year = sc.nextInt();

        // 获取一个当前日历对象
        Calendar instance = Calendar.getInstance();

        // 设置日类对象年份和 日期为 3月1日
        instance.set(year, 2, 1);

        // 通过 add() 方法调整时间, 往前推一天
        instance.add(Calendar.DAY_OF_MONTH, -1);

        // 通过 get() 方法获取已修改过日期的天数
        int i = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年的2月有" + i + "天");

    }

    public static void print_Calendar(Calendar i) {
        System.out.print(i.get(Calendar.YEAR) + "年");
        System.out.print((i.get(Calendar.MONTH) + 1) + "月");
        System.out.print(+i.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.print("\t星期" + (i.get(Calendar.DAY_OF_WEEK) - 1));
        System.out.print("\t" + (i.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
        System.out.print("\t" + i.get(Calendar.HOUR) + "点");
        System.out.print(i.get(Calendar.MINUTE) + "分");
        System.out.print(i.get(Calendar.SECOND) + "秒");
        System.out.print(i.get(Calendar.MILLISECOND) + "毫秒");
        System.out.println();
    }
}
