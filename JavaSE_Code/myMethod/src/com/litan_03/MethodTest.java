package com.litan_03;

public class MethodTest {
    public static void main(String[] args) {
        //getMax(15,69);

        int flag = getMax(19,56);
        System.out.println(flag);
    }

    //需求：设计一个方法可以获取两个数中较大值，数据来自于参数
    //定义方法
    public static int getMax(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
