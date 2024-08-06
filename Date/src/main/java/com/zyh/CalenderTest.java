package com.zyh;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author GG_B
 * @version 1.0
 */
public class CalenderTest {
    public static void main(String[] args) {
//        获取一个日历对象，默认是系统当前时间
        Calendar calendar = Calendar.getInstance();
//        获取日历表示日期对象
        Date time = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));

        long l = System.currentTimeMillis() - 3 * 24 * 60 * 60 * 1000;
        Date before = new Date(l);
//        设置时间为3天前
        calendar.setTime(before);
//        设置年份
        calendar.set(Calendar.YEAR,2024);
//        设置月份
        calendar.set(Calendar.MONTH,4);
//        天数减一
        calendar.roll(Calendar.DAY_OF_MONTH,-1);
//        获取年份
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day_of_month = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "/" + month + "/" + day_of_month);
    }
}
