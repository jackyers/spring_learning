package com.zyh;

import java.util.Date;

/**
 * @author GG_B
 * @version 1.0
 */
public class DateTest {
    public static void main(String[] args) {
//        无参构造，表示计算机系统当前时间，精确到毫秒
        Date now = new Date();
        System.out.println(now);
        long currentTime = System.currentTimeMillis()- 24 * 60 * 60 * 1000;
//        带参构造，表示根据给定的时间数字来构建一个日期对象，精确到毫秒
        Date date = new Date(currentTime);
        System.out.println(date);
//        获取日期对象中的时间数字，精确到毫秒
        System.out.println(date.getTime());
//        判断当前对象表示的日期是否在给定日期之前
        boolean before = now.before(date);
        System.out.println(before);
//        判断当前对象表示的日期是否在给定日期之后
        boolean after = now.after(date);
        System.out.println(after);
    }

}
