package com.litan_02;

public class ArrayTest_02 {
    public static void main(String[] args) {
        //定义两个数组
        int arr[] = new int[3];
        int arr2[] = new int[3];
        //输出数组名和元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        //给数组中的元素赋值
        arr[0] = 100;
        arr2[2] = 200;

        //输出数组名和元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
