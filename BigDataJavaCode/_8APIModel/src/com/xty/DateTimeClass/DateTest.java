package com.xty.DateTimeClass;

import java.text.ParseException;

/*
 *  测试Date类，（日期类）
 *
 * */
public class DateTest {
    public static void main(String[] args) throws ParseException {

        // 如果通过无参构造Date对象，它会将当前时间作为对象的时间值
//        Date date = new Date();

//        Calendar instance = Calendar.getInstance();
//
//        Date time = instance.getTime();
//
//
//        // 日期 ——> 字符串
//        // 需要对日期进行格式化展示
//
//        // 1. 创建一个 SimpleDateFormat 类对象, 并且写出对应的 模式字符串
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 a hh时mm分ss秒 本年第ww周 本年第DD天 ");
//
//        // 2. 调用 SimpleDateFormat 类对象的 format() 方法，将想要转化的 Date 对象传入，就能得到对应的格式化时间文本
//
//        System.out.println(time);
//        String format = sdf.format(time);
//
//        System.out.println(format);

        // 字符串 ——> 日期
        // 接收一个用户输入的日期
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您的出生日期（年-月-日）：");
//        String string_date = scanner.next();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date d = sdf.parse(string_date);
//
//        System.out.println(d);

//        Date date = new Date();
//
//        String s = DateUtils.dateToString(date, "yyyy年MM月dd日 a hh点mm分ss秒SS毫秒");
//
//        System.out.println(s);
//
//
//        String t = "1888年10月23日 10:02:35";
//
//        Date d = DateUtils.stringToDate(t, "yyyy年MM月dd日 HH:mm:ss");
//
//        System.out.println(d);

//        Date date = new Date();
//        date.setTime(0l);
//
//        Calendar old_time = Calendar.getInstance();
//        old_time.setTime(date);
//
//
//        Calendar new_time  = Calendar.getInstance();
//
//
//        int i1 = old_time.compareTo(new_time);
//        int i2 = new_time.compareTo(old_time);
//        int i3 = new_time.compareTo(new_time);
//
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
//
//        System.out.println(new_time.getFirstDayOfWeek());

//        String[] availableIDs = TimeZone.getAvailableIDs();
//
//        for (String i : availableIDs) {
//            System.out.println(i);
//        }
//
//        TimeZone timeZone = TimeZone.getTimeZone("Etc/UTC");
//        Calendar instance = Calendar.getInstance(timeZone);
//        instance.setTime(new Date(0l));
//        System.out.println(instance);


    }

}
