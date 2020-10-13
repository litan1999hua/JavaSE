package com.litan_02;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {
        //在main方法中调用定义好的方法（使用常量）
        getMax(10, 20);

        //在main方法中调用定义好的方法（使用变量）
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        getMax(a, b);
    }

    //需求：设计一个方法用于打印两个数中的较大数，数据来自于方法参数
    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println("max:" + a);
        } else {
            System.out.println("max:" + b);
        }
    }
}
