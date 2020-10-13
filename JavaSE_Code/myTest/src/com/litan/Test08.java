package com.litan;
/*
    需求：已知一个数组，键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值
 */

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = {15,645,894,365,456};
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入这个数据：");
        int number = sc.nextInt();
        /*
        int index = -1;

        for(int x = 0;x < arr.length;x++){
            if(number == arr[x]){
                index = x;
                break;
            }
        }
        */

        int index = getIndex(arr,number);
        if(index >= 0 && index < arr.length) {
            System.out.println("这个数据在数组中的索引是：" + index);
        }else{
            System.out.println("这个数据不在数组中");
        }
    }
    public static int getIndex(int[] arr,int number){
        int index = -1;

        for(int x = 0;x < arr.length;x++){
            if(number == arr[x]){
                index = x;
                break;
            }
        }
        return index;
    }

}
