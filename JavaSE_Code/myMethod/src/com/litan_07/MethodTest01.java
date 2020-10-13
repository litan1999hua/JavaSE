package com.litan_07;

public class MethodTest01 {
    public static void main(String[] args) {
       //定义一个数组，用静态初始化完成数组初始化
       int[] arr = {11,22,33,44,55};
       printArray(arr);
    }
    //定义一个方法，用数组遍历通用格式对数组进行遍历
    /*
        返回值类型：void
        参数：int[] arr
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x = 0;x < arr.length;x ++){
            if(x < arr.length - 1) {
                System.out.print(arr[x] + ", ");
            }else{
                System.out.print(arr[x]);
            }
        }
        System.out.println("]");
    }
}
