package com.litan_01;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        /*int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("排序的五个数字");
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个数:");
            arr[x] = sc.nextInt();
        }

        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }*/
        int[] arr = {14,8,66,32,159};
        System.out.println("排序前：" + arrayToString(arr));


        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("排序后：" + arrayToString(arr));

    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length -1){
                sb.append(arr[i] + "]");
            }else{
                sb.append(arr[i] + ", ");
            }
        }
        String s = sb.toString();
        return s;
    }
}
