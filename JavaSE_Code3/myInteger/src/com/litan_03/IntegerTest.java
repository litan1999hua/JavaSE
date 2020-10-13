package com.litan_03;

import java.util.Arrays;

/*
        需求：有一个字符串“14 55 99 31 4”，最终程序输出结果是“4 14 31 55 99”
        1.定义一个字符串
        2.把字符串中的数字储存到一个int数组中
            public String[] split(String s)得到字符串中每一个数字
            public static int parseInt(String s)定义一个int数组，把String数组中每一个元素储存进来
        3.对int数组进行排序
        4.把排序后的数组拼接到一个字符串，用StringBuilder实现
        5.输出结果
 */
public class IntegerTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "14 55 99 31 4";

        //把字符串中的数字储存到一个int数组中
        //public String[] split(String s)得到字符串中每一个数字
        String[] arr1 = s.split(" ");
//        for(int i = 0;i < arr1.length;i++){
//            System.out.println(arr1[i]);
//        }

        //public static int parseInt(String s)定义一个int数组，把String数组中每一个元素储存进来
        int[] arr = new int[arr1.length];
        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(arr1[i]);
//            System.out.println(arr[i]);
        }

        //对int数组进行排序
        Arrays.sort(arr);

        //把排序后的数组拼接到一个字符串，用StringBuilder实现
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String ss = sb.toString();

        //输出结果
        System.out.println("ss:" + ss );

    }
}
