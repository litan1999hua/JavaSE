package com.litan_03;
import java.util.Scanner;
/*
    需求：键盘录入一个字符串，在控制台遍历该字符串
    1.键盘录入一个数据，用Scanner类实现
    2.遍历字符串，首先获取到字符串中的每一个字符
        public char charAt(int index)：返回指定索引处的char值，字符串索引也是从0开始的
    3.获取字符串的长度
        public int length():返回字符串的长度
        数组长度：数组名.length
        字符串长度：字符串对象.length()
    4.遍历字符串的通用格式
        for(int i = 0; i < s.length();i++){
            s.charAt(i);
        }
 */
public class StringTest02 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //键盘录入一个数据，用Scanner类实现
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        //遍历字符串
        for(int i = 0; i < s.length();i++){
            if(i == s.length() - 1) {
                System.out.print(s.charAt(i));
            }else{
                System.out.print(s.charAt(i) + ", ");
            }
        }
    }
}
