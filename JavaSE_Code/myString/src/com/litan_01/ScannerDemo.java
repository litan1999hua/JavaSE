package com.litan_01;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入一个字符串数据:");
//        String line = sc.nextLine();
//      Ctrl+Alt+V
        String line = sc.nextLine();

        //输出结果
        System.out.println("你输入的数据是：" + line);
    }
}
