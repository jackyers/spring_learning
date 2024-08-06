package com.zyh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author GG_B
 * @version 1.0
 */
public class DateFormatTest {
    public static void main(String[] args) {
        Date now = new Date();
//        根据给定的日期格式构建一个日期格式化对象
//        yyyy-MM-dd HH:mm:ss yyyy/MM/dd HH:mm:ss
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        将给定日期对象进行格式化
        String formatStr = dateFormat1.format(now);
        System.out.println(formatStr);

        String s = "2000/01/01 12:01:50";
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        将给定的字符串格式日期解析为日期对象
        try {
            Date parse = dateFormat2.parse(s);
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
