package com.litan_04;
/*
    throws
    在方法声明的后面，跟的是异常类名
    表示抛出异常，由该方法的调用者处理
    表示出现异常的一种可能性，并不一定会发生这种异常

    throw
    用在方法体内，跟的是异常对象名
    表示抛出异常，有方法体内的语句处理
    执行throw，一定是抛出了某种异常
 */
import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
