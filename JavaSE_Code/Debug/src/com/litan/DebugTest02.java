package com.litan;
import java.util.Scanner;

public class DebugTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        System.out.println("较大的数是：" + getMax(a,b));

    }

    /*
        返回值：int
        参数：int a,int b
     */
    public static int getMax(int a,int b){
        if(a > b){
            return  a;
        }else{
            return b;
        }
    }


}
