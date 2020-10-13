package com.litan_02;

import java.util.ArrayList;
import java.util.Collections;

/*
    1.创建一个牌盒，定义一个ArrayList集合
    2.往牌盒里面装牌
    3.洗牌,Collections里的shuffle()方法实现
    4.发牌，遍历集合，给三个玩家发牌
    5.看牌，三个玩家分别遍历自己的牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，定义一个ArrayList集合
        ArrayList<String> array = new ArrayList<String>();

        //往牌盒里面装牌
        /*
            ♦2，♦3，♦4...♦k,♦A
            ♣2,...♣A
            ♥2,...♥A
            ♠2,...♠A
            大王，小王
         */
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};

        //定义点数
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");


        //洗牌,Collections里的shuffle()方法实现
        Collections.shuffle(array);

//        System.out.println(array);

        //发牌，遍历集合，给三个玩家发牌
        ArrayList<String> ai1 = new ArrayList<String>();
        ArrayList<String> ai2 = new ArrayList<String>();
        ArrayList<String> ai3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dipai.add(poker);
            } else if (i % 3 == 0) {
                ai1.add(poker);
            } else if (i % 3 == 1) {
                ai2.add(poker);
            } else if (i % 3 == 2) {
                ai3.add(poker);
            }
        }

        //看牌，三个玩家分别遍历自己的牌
        lookPoker("ai1", ai1);
        lookPoker("ai2", ai2);
        lookPoker("ai3", ai3);
        lookPoker("底牌", dipai);
    }

    //看牌方法
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是:");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
