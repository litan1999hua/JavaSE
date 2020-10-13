package com.litan_03;

import java.util.Scanner;
/*
    需求：已知用户名和密码，请用程序实现模拟用户登录。总共三次机会，登录之后，会给出相应的提示
        1.定义两个字符串（用户名和密码）；
        2.键盘录入要登录的用户名和密码，用Scanner类实现
        3.拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。用equals（）方法实现
        4.用循环实现三次机会，用for循环实现，并在登陆成功时，使用break结束循环
 */

public class StringTest01 {
    public static void main(String[] args) {
        //定义两个字符串（用户名和密码）；
        String username = "brk212";
        String password = "www...555";

        Scanner sc = new Scanner(System.in);

        //用循环实现三次机会，用for循环实现，并在登陆成功时，使用break结束循环
        for (int i = 0; i < 3; i++) {
            // 键盘录入要登录的用户名和密码，用Scanner类实现
            System.out.println("请输入用户名：");
            String s1 = sc.nextLine();
            System.out.println("请输入密码：");
            String s2 = sc.nextLine();

            //拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。用equals（）方法实现
            boolean s3 = s1.equals(username);
            boolean s4 = s2.equals(password);
            if (s3 == true && s4 == true) {
                System.out.println("登录成功！");
                break;
            } else {
                if(i == 2){
                    System.out.println("你的账户被锁定，请与管理员联系！");
                }else {
                    System.out.println("登录失败！你还有" + (2 - i) + "次机会");
                }
            }

        }
    }
}
