package com.litan_02;
/*
    public abstract void add(int field,int amount)
    根据日历的规则，将指定的时间量添加或减去给定的日历字段

    public final void set(int year,int mouth,int date):设置当前日历的年月日
 */

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();

        //public int get(int field):返回给定日历字段的值
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) +1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //public abstract void add(int field,int amount)
        //根据日历的规则，将指定的时间量添加或减去给定的日历字段
        //需求1：三年前的今天
//        c.add(Calendar.YEAR ,-3);
//
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) +1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //需求2：10年后的5天前
//        c.add(Calendar.YEAR ,10);
//        c.add(Calendar.DATE,-5);
//
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) +1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //public final void set(int year,int mouth,int date):设置当前日历的年月日
        c.set(2095,0,20);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) +1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
