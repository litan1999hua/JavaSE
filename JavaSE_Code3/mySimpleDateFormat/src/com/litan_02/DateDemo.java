package com.litan_02;

import java.text.ParseException;
import java.util.Date;

/*
    测试类
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy-MM-dd");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);
        System.out.println("--------");

        String s = "2095年01月20日 12:35:50";
        Date d1 = DateUtils.stringToDate(s, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(d1);

    }
}
