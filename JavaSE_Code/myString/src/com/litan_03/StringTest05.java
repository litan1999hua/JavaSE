package com.litan_03;
import java.util.Scanner;
/*
    需求：定义一个方法，反转该字符串并返回，键盘录入一个字符串，调用该方法在控制台输出结果
          例如，键盘录入abc，输出结果cba
          1.键盘录入一个字符串s，用Scanner实现
          2.定义一个方法，反转字符串。返回值类型：String，参数：String s
          3.遍历该字符串
          4.用一个变量接受方法
          5.输出结果
 */
public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //键盘录入一个字符串s，用Scanner实现
        System.out.println("请输入一个字符串：");
        String s1 = sc.nextLine();

        String result = reverse(s1);
        System.out.println("s:" + result);
    }

    //定义一个方法，反转字符串。返回值类型：String，参数：String s
    public static String reverse(String s2){
        String ss = "";
        for (int x = s2.length() - 1;x >= 0;x--){
                ss += s2.charAt(x);
        }
        return ss;
    }
}
