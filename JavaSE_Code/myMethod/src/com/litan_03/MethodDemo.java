package com.litan_03;

public class MethodDemo {
    public static void main(String[] args) {
        //isEvenNumber(150);
        //true

        boolean flag = isEvenNumber(150);
        //boolean flag = true;
        System.out.println(flag);
    }

    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数，并返回真假值
    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
