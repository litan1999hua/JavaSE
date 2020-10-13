package com.litan_02;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        //public static void exits(int status);终止当前运行的Java虚拟机
//        System.exit(0);
        System.out.println("结束");

        //public static long currentTimeMillis();返回当前时间（以毫秒为单位）1970年1月1日
//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365 + "年");

        long start = System.currentTimeMillis();
        for(int i = 0;i < 1000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        long time = end - start;
        System.out.println("共耗时" + time + "毫秒");

    }
}
