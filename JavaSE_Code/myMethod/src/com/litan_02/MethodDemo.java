package com.litan_02;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(10);

        //创建对象
        Scanner sc = new Scanner(System.in);
        //录入数据
        System.out.println("请输入这个数：");
        int a = sc.nextInt();
        //变量值的调用
        isEvenNumber(a);
    }
    //需求：定义一个方法，该方法接收一个参数，判断该数据是否为偶数
    public static void isEvenNumber(int number){
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}


