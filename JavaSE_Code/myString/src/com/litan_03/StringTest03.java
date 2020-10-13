package com.litan_03;
import java.util.Scanner;
/*
    需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其它字符）
        1.键盘录入一个字符串，使用Scanner方法
        2.统计三种类型字符的个数，定义三个初始值为0的变量
        3.遍历字符串得到每一个字符
        4.判断该字符属于那种类型,对应的统计变量+1
            假如ch是一个字符，判断字符属于那种类型，判断该字符是否在对应的范围即可
            大写字母：ch>='A'&&ch<='Z'
            小写字母：ch>='a'&&ch<='z'
            数字：ch>='0'&&ch<='9'
        5.输出三种类型的字符个数

 */
public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //键盘录入一个字符串，使用Scanner方法
        System.out.println("请输入字符串:");
        String s = sc.nextLine();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                a++;
            }else if(ch>='a'&&ch<='z'){
                b++;
            }else if(ch>='0'&&ch<='9'){
                c++;
            }
        }
        System.out.println("大写字母:" + a + "个");
        System.out.println("小写字母:" + b + "个");
        System.out.println("数字:" + c + "个");
    }
}
