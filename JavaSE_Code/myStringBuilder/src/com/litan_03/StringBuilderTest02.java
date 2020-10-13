package com.litan_03;
import java.util.Scanner;
/*
    需求：定义一个方法，反转该字符串并返回，键盘录入一个字符串，调用该方法在控制台输出结果
          例如，键盘录入abc，输出结果cba
          1.键盘录入一个字符串s，用Scanner实现
          2.使用public StringBuilder(String s) 构造方法转换为可变字符串
          3.调用public StringBuilder reverse();反转字符串
          4.输出结果
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //键盘录入一个字符串s，用Scanner实现
        System.out.println("请输入字符串：");
        String s = sc.nextLine();

        //使用public StringBuilder(String s);构造方法转换为可变字符串
        StringBuilder sb = new StringBuilder(s);

        //调用public StringBuilder reverse();反转字符串
        sb.reverse().toString();

        //输出结果
        System.out.println("sb:" + sb);
    }
}
