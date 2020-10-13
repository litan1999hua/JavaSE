package com.litan_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
    1.定义学生类
    2.创建TreeSet集合，并用比较器排序进行排序
    3.键盘录入学生数据
    4.创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
    5.把学生对象添加到集合
    6.创建字符缓冲输出流对象
    7.遍历集合，得到每一个学生对象
    8.按照要求把每一个学生对象拼接成字符串
    9.写数据
    10.释放资源
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合，并用比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //成绩从高到低
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath():num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()): num3;
                return num4;
            }
        });

        //键盘录入学生数据
        for(int i = 0;i < 5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
            Student s = new Student(name,chinese,math,english);

            //把学生对象添加到集合
            ts.add(s);
        }

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\students.txt"));

        //遍历集合
        for(Student s:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            String line = sb.toString();

            //写数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
