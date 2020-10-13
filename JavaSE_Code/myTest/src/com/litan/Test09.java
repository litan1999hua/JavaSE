package com.litan;
/*
    需求：已知一个数组arr，用程序把数组中的元素值倒序交换
 */
public class Test09 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {15,16,17,18,19};
        /*
        for(int start = 0,end = arr.length - 1;start <= end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.print("[");
        for(int x = 0;x < arr.length ;x++){
            if(x == arr.length -1){
                System.out.print(arr[arr.length-1] + "]");
            } else{
                System.out.print(arr[x] + ", ");
            }
        }
        */
        reverse(arr);
        printArray(arr);
    }
    //两个方法一个调换变量reverse,一个遍历数组printArray
    /*
        reverse
        返回值：void
        参数：int[] arr

        printArray
        返回值：void
        参数：int[] arr
     */
    public static void reverse(int[] arr){
        for(int start = 0,end = arr.length - 1;start <= end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x = 0;x < arr.length;x++){
            if(x == arr.length - 1){
                System.out.print(arr[x] + "]");
            }else{
                System.out.print(arr[x] + ", ");
            }
        }
    }

}
