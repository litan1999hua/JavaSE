package com.litan_03;
import java.util.Arrays;
/*
    工具类设计思想：
        构造方法用private修饰
        成员用public static修饰
 */
public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {12,99,0,65,44};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        Math
//        System
    }
}
