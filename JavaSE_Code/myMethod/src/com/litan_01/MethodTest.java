package com.litan_01;

public class MethodTest {
    public static void main(String[] args) {
        getMax();
    }


    //定义一个方法，用于打印两个数中的较大数
    public static void getMax() {
        //方法中定义两个变量，保存两个数字
        int a = 10;
        int b = 20;

        //使用分支语句判断两个数字的大小，并打印较大数
        if (a > b) {
            System.out.println("max:" + a);
        } else {
            System.out.println("max:" + b);
        }
    }
}