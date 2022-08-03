package com.xty.DateTimeClass;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 *
 *  一个日期工具类，
 *   提供两个方法，一个是 Date 转 String，一个是将 String 转 Date
 *
 * */
public class DateUtils {
    /*
     *  将日期类对象 d， 转换为 format 格式。
     *   @prarm d：要转换的日期对象
     *   @prarm format：表示格式字符串
     *   @return：转换完成的时间字符串
     * */
    public static String dateToString(Date d, String format) {
        // 想要将Date转为指定格式的字符串，需要使用到 SimpleDateFormat类

        // 1. 创建SimpleDateFormat类对象
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        // 2. 调用这个对象的 format() 方法，转换Date为String
        String time = sdf.format(d);
        // 2. 返回转换完成的String
        return time;
    }

    /*
     *   将时间字符串按照指定的模式，转换为Date对象
     *   @prarm time: 表示要转换的时间的字符串
     *   @prarm format: 表示要按照的格式
     *   @return：转换完成的Date对象
     * */
    public static Date stringToDate(String time, String format) throws ParseException {
        //1.创建指定格式的SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        //2.使用这个对象的parse()方法，将字符串转为Date对象

        Date d = sdf.parse(time);
        //3.返回这个Date对象
        return d;
    }

    /*
     *  将Date日期对象转为Calender日历类对象
     *
     * */
    public static Calendar dateToCalendar(Date d) {
        return null;
    }
}
