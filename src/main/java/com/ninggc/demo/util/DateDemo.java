package com.ninggc.demo.util;

import com.ninggc.tools.interfaces.IGson;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("all")
public class DateDemo implements IGson {
    static DateFormat dateFormat;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd hh-mm-ss");

    public static void main(String[] args) {
//        showDateInfo();
//        showTimestampInfo();
        showCalendarInfo();
    }

    static void showDateInfo() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(DateFormat.getDateInstance().format(date));
        System.out.println(SimpleDateFormat.getDateInstance().format(date));
        System.out.println(simpleDateFormat.format(date));
    }

    static void showDateTimeInfo() {
//        DateTime
    }

    static void showTimestampInfo() {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        System.out.println(timestamp);
    }

    static void showCalendarInfo() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("年份（年）：" + calendar.get(Calendar.YEAR));
        System.out.println("一年中的第多少天：" + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("一年中的第多少星期：" + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("===");
        System.out.println("未知：" + calendar.get(Calendar.MONTH));
        System.out.println("一月中的第多少天（日）：" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("一个月中的第几星期：" + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("未知：" + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("===");
        System.out.println("一年中的第多少天：" + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("一月中的第多少天：" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("一周中的第多少天：" + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("===");
        System.out.println("12h：" + calendar.get(Calendar.HOUR));
        System.out.println("24h：" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.getTime().getTime());
        System.out.println(calendar.getTimeInMillis());
        try {
            Calendar calendar1 = calendar.getClass().newInstance();
            System.out.println(calendar1);
            System.out.println(calendar1.getTimeInMillis());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
