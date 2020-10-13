package com.litan;

import java.util.Date;

/*
    public long getTime() 获取对象是从1970年1月1日00：00：00到现在的毫秒值
    public void setTime(long time) 设置时间给的是毫秒值
 */
public class DateDemo2 {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();

        //public long getTime() 获取对象是从1970年1月1日00：00：00到现在的毫秒值
//        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time) 设置时间给的是毫秒值
//        long time = 1000*60*60*24;
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);

    }
}
