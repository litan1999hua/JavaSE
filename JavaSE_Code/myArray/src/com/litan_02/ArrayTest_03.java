package com.litan_02;

public class ArrayTest_03 {
    public static void main(String[] args) {
        //定义一个数组
        int arr[] = new int[3];
        //给数组中的元素赋值
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //定义第二个数组指向第一个数组
        int arr2[] = arr;
        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;

        //输出数组名和元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2);
        System.out.println(arr2[0]);

    }
}
