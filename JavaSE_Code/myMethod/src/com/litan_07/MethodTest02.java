package com.litan_07;
/*
    需求；设计一个方法用于获取数组元素中的最大值，调用方法并输出结果

 */
public class MethodTest02 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {11,22,33,44,55};
        //调用获取数组最大值的方法，在控制台输出返回值
        System.out.println(getMaxArray(arr));

    }
    /*
        定义一个方法，用于获取数组中的最大值
        返回值类型：int
        参数：int[] arr
     */
    public static int getMaxArray(int[] arr){
        int max = arr[0];
        for(int x = 1;x < arr.length;x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }
}
