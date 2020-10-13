package com.test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
    学生管理系统
    1.设计学生类
    2.设计主页面
    3.设计添加学生页面
    4.设计删除学生页面
    5.设计修改学生页面
    6.设计查看学生页面

 */
public class StudentManager {
    public static void main(String[] args) {
        /*
            主页面的设计
                1.创建一个学生类型的集合，用于储存学生数据
                2.主页面设计
                3.用Scanner实现录入
                4.用switch语句实现功能选择
                5.用循环实现多次使用
         */
        //创建一个学生类型的集合，用于储存学生数据
        ArrayList<Student> array = new ArrayList<>();

        //用循环实现多次使用
        while (true) {
            //主页面设计
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");

            //用Scanner实现录入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择：");
            String s = sc.nextLine();

            //用switch语句实现功能选择
            switch (s) {
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
                    findStudent(array);
                    break;
                case "5":
                    System.out.println("你选择退出系统！");
                    System.exit(0);//跳出循环
            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        /*
            1.创建学生对象
            2.用Scanner录入学生信息
            3.判断集合中是否存在学号
            4.将录入的数据给学生类中的成员变量
            5.往集合中添加对象
            6.提示信息
         */
        //创建学生对象
        Student s = new Student();

        //用Scanner录入学生信息
        Scanner sc = new Scanner(System.in);
        String sid;
        //用while重新输入
        while (true) {
            System.out.println("请输入学号：");
           sid = sc.nextLine();
            //判断集合中是否存在学号
            if (isUsed(array, sid)) {
                System.out.println("学号已存在，请重新输入：");
            } else {
                break;
            }
        }

        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        String age = sc.nextLine();
        System.out.println("请输入居住地:");
        String address = sc.nextLine();

        //将录入的数据给学生类中的成员变量
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //往集合中添加对象
        array.add(s);

        //提示信息
        System.out.println("添加学生成功！");
    }

    //定义一个方法，用于查看学生信息
    public static void findStudent(ArrayList<Student> array) {
        /*
            遍历集合，显示集合中的学生数据
         */
        if (array.size() == 0) {
            System.out.println("无学生信息，请添加学生！");
        } else {
            System.out.println("学号\t\t姓名\t年龄\t居住地");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t\t" + s.getAddress());
            }
        }
    }

    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        /*
            1.用Scanner录入数据
            2.遍历集合
            3.用if语句判断输入的学号是否有效
            4.给出提示信息
            5.调用方法
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生学号：");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                array.remove(index);
                System.out.println("删除成功");
                break;
            }
        }

        if (index == -1) {
            System.out.println("无效的学号，删除失败");
        }
    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        /*
            1.用Scanner输入学生学号
            2.创建学生对象
            3.把录入的数据赋值给Student成员变量
            4.遍历数组
            5.显示提示信息
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                index = i;
                System.out.println("修改信息成功！");
                break;
            }
        }

        if(index == -1){
            System.out.println("你输入的学号有误，请重新输入！");
        }

    }

    //定义一个方法，对学号是否被使用进行判断
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        //定义一个boolean类型的变量，用于储存结果
        boolean result = false;

        //判断学号是否被使用，遍历集合判断
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                result = true;
            }
        }
        return result;
    }
}
