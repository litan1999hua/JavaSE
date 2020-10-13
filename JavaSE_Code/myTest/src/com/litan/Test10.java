package com.litan;

import java.util.Scanner;

/*
    需求：在编程竞赛中，有6个评委为参赛选手打分，分数为0-100整数部分，
          选手的最后得分为：去掉一个最高分和一个最低分后的四个评委平均值（不考虑小数部分）
    分析：
          1.定义一个数组，用于储存评委的分数。
          2.键盘录入评委的分数，采用循环。
          3.定义两个方法，一个获取数组中的最大值，一个获取数组中最小值
          4.定义一个方法，获取数组中所有元素的和
          5.调用方法，利用计算规则算出选手的最后的得分
          6.输出分数
 */

public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个评委的分数：");
            arr[x] = sc.nextInt();
        }

        printArray(arr);
        int max = getMaxArray(arr);
        int min = getMinArray(arr);
        int sum = sumArray(arr);
        int grade = (sum - min - max)/4;
        System.out.println("选手最后得分是：" + grade);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "]");
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
    }

    public static int getMaxArray(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    public static int getMinArray(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for(int x = 0;x < arr.length;x++){
            sum += arr[x];
        }
        return sum;
    }
}
