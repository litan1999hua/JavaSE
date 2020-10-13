package com.litan_03;
/*
    需求：获取任意一年的二月有多少天
    分析：
        1：键盘录入年份
        2：设置日历的年月日
        3:3月1日往前推一天，就是2月的天数
        4.输出结果
 */

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();

        //键盘录入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int y = sc.nextInt();
        c.set(y,2,1);
        c.add(Calendar.DATE,-1);

        int date = c.get(Calendar.DATE);
        System.out.println(y + "年二月有" + date + "天");
    }
}
