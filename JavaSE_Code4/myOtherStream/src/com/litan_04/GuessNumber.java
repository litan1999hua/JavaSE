package com.litan_04;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start(){
        //使用随机数生成一个要猜的数字 范围1-100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        //键盘录入你给的数字
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你给的数字：");
            int guessNumber = sc.nextInt();

            //对猜的结果进行判断
            if (guessNumber < number) {
                System.out.println("你猜的" + guessNumber + "小了！");
            } else if (guessNumber > number){
                System.out.println("你猜的" + guessNumber + "大了！");
            }else{
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
    }
}
