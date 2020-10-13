package com.litan_01;

import java.util.Calendar;

/*
    Calendar类是一个抽象类，可以为在某一特定时刻和一组之间的转换的方法calendar fields
    如YEAR ， MONTH ， DAY_OF_MONTH ， HOUR ，等等，以及用于操纵该日历字段，
    如获取的日期下个星期。

    Calendar提供了一种类方法getInstance ，用于获取此类型的一般有用的对象。
   此方法返回一个Calendar对象，其日历字段已使用当前日期和时间进行初始化：
        Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();//多态的形式得到对象
//        System.out.println(c);

        //public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }
}
