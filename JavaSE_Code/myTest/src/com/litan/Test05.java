package com.litan;
/*
    需求：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一，百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
    思路：
        1.第一层循环，用于表示鸡翁的范围，初始换表达式的变量定义为 x=0，判断条件是x<=20
        2.第二层循环，用于表示鸡母的范围，初始化表达式的变量定义为y=0，判断条件是y<=33
        3.第三层循环，用于表示鸡雏的范围，初始化表达式的变量定义为z=0，判断条件是z<=100
*/
public class Test05 {
    public static void main(String[] args) {
        for(int x = 0;x <= 20;x++){
            for(int y = 0;y <= 33;y++){
                int z = 100 - x - y;
                if(z%3 == 0 && 5*x + 3*y + z/3 == 100){
                        System.out.println("鸡翁的数量是：" + x);
                        System.out.println("鸡母的数量是：" + y);
                        System.out.println("鸡雏的数量是：" + z);
                        System.out.println();
                    }

            }
        }
    }
}
