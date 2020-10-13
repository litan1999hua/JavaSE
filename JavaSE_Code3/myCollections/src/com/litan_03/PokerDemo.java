package com.litan_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌。要求：对牌进行排序

    思路：
        1：创建HashMap集合，键是编号，值是牌
        2：创建ArrayList集合，存储编号
        3：创建花色数组和点数数字
        4：从0开始往HashMap集合中存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        5：洗牌（洗的是编号），用Collections的Shuffle（）方法实现
        6：发牌（看的是编号，为了保证编号是排序的，用TreeSet集合接受）
        7：定义看牌方法（遍历TreeSet方法，获取编号，到HashMap集合中找对应的牌）
        8.调用方法
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建HashMap集合，键是编号，值是牌
        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        //创建ArrayList集合，存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();

        //创建花色数组和点数数组
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};

        //定义点数数组
        String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A","2"};

        //从0开始往HashMap集合中存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;

        for(String number:numbers){
            for(String color:colors){
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }

        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        //洗牌（洗的是编号），用Collections的Shuffle（）方法实现
        Collections.shuffle(array);

        //发牌（看的是编号，为了保证编号是排序的，用TreeSet集合接受
        //定义四个集合用来收牌
        TreeSet<Integer> ai1 = new TreeSet<Integer>();
        TreeSet<Integer> ai2 = new TreeSet<Integer>();
        TreeSet<Integer> ai3 = new TreeSet<Integer>();
        TreeSet<Integer> dipai = new TreeSet<Integer>();

        for(int i = 0;i < array.size();i++){
            Integer x = array.get(i);
            if(i >= array.size() - 3){
                dipai.add(x);
            }else if(i%3==0){
                ai1.add(x);
            }else if(i%3==1){
                ai2.add(x);
            }else if(i%3==2){
                ai3.add(x);
            }
        }

        //调用方法
        lookPoker("ail",ai1,hm);
        lookPoker("ai2",ai2,hm);
        lookPoker("ai3",ai3,hm);
        lookPoker("底牌",dipai,hm);


    }

    //定义看牌方法（遍历TreeSet方法，获取编号，到HashMap集合中找对应的牌）
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        StringBuilder sb = new StringBuilder();
        sb.append(name + "的牌是:");

        //遍历TreeSet方法，获取编号
        for(Integer i:ts){
            //到HashMap集合中找对应的牌
            String poker = hm.get(i);
            sb.append(poker).append(" ");
        }

        String s = sb.toString();
        System.out.println(s);
    }
}
