package com.litan_04;

public class Student {
    String name;
    //int age;
    private int age;

    //提供get和set方法
    public void setAge(int a){
    //    age = a;
        if(a < 0||a > 120){
            System.out.println("你给的年龄有误！");
        }else{
            age = a;
        }
    }

    public int getAge(){
        return age;
    }


    public void show() {
        System.out.println(name + "," + age);
    }

}
