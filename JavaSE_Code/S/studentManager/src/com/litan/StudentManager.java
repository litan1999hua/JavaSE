package com.litan;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
/*
    学生管理系统
    1.定义学生类
    2.主界面的代码编写
    3.添加学生的代码编写
    4.查看学生的代码编写
    5.删除学生的代码编写
    6.修改学生的代码编写
 */

public class StudentManager {
    /*
        1.用输出语句完成主界面的编写
        2.用Scanner实现键盘录入数据
        3.用switch完成操作的选择
        4.用循环再次回到主界面
     */
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();
        //用循环再次回到主界面
        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用switch完成操作的选择
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
//                    break;
                    System.exit(0);//JVM退出
            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //键盘录取学生对象所用的数据
        Scanner sc = new Scanner(System.in);

        //为了让sid在while循环外面能被访问到
        String sid;

        //为了让程序回到这里采用while循环
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            if (isUsed(array, sid)) {
                System.out.println("你输入的学号已经被使用，请重新输入！");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //往集合中添加学生对象
        array.add(s);

        //给出添加学生的提示信息
        System.out.println("添加学生成功！");
    }

    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        //判定集合中是否有数据，如果没有数据就显示“无信息，请添加学生信息！”
        if (array.size() == 0) {
            System.out.println("无信息，请添加学生信息！");
            //为了让程序不再往下执行
            return;
        }
        //显示表头信息
        //\t 其实就是tab键的位置
        System.out.println("学号\t\t姓名\t年龄\t\t居住地");

        //将集合中的数据取出，按照对应格式显示学生信息，年龄补充“岁”
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        //显示表头信息
        System.out.println("请输入要删除的学生学号：");

        //键盘录入要删除的学生学号
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();

        //遍历集合将对应的学生对象从集合中删除
        for (int i = 0;i < array.size();i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                array.remove(i);

                //给出删除成功提示
                System.out.println("删除学生成功！");
                break;
            }else{
                System.out.println("你输入的学号不存在，请重新输入！");
            }
        }


    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        //显示表头信息
        System.out.println("请输入要修改的学生学号：");

        //键盘录入要修改的学生学号
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();

        //键盘录入要修改的学生信息
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合修改对应的学生信息
        for(int i = 0;i < array.size();i++){
            Student ss = array.get(i);
            if(ss.getSid().equals(sid)){
                array.set(i,s);
                System.out.println("修改信息成功！");
                break;
            }else{
                System.out.println("你输入的学号不存在，请重新输入！");
            }
        }

        //给出修改成功提示
    }

    //定一个方法，对学号是否被使用进行判断
    public static boolean isUsed(ArrayList<Student> array,String sid){
        //定义一个boolean类型的变量储存结果
        boolean result = false;
        //遍历集合
        for(int i = 0;i < array.size();i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                result = true;
            }
        }
        return result;
    }
}
