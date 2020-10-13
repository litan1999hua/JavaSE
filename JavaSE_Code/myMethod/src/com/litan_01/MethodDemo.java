package com.litan_01;

public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isevennumber();
    }
    //定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static void isevennumber(){

        //定义变量
        int number = 55;

        //判断是否是偶数
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
