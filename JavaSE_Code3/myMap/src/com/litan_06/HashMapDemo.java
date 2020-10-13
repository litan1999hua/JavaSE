package com.litan_06;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
    需求：
        键盘录入一个字符串，要求统计字符串中每个字符出现的次数
        举例：键盘录入“aaddabbceeecdbdde”在控制台输出"a(3)b(3)c(2)d(5)e(4)"

    思路：
        1.键盘录入一个字符串
        2.创建hashmap集合，键是char包装类，值是int包装类
        3.遍历字符串，得到每一个字符
        4.拿得到的每一个字符作为键到hashmap集合中去找对应的值，看其返回值
            如果返回值是null，说明该字符在集合中不存在，就把该字符作为键，1为值储存
            如果返回值不是null，说明该字符在集合中存在，值加一，重新存储键值
        5.遍历集合，按照要求进行拼接
        6.输出结果
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //创建hashmap集合，键是char包装类，值是int包装类
//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();

        //遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            //拿得到的每一个字符作为键到hashmap集合中去找对应的值，看其返回值
            Integer value = hm.get(key);

            if (value == null) {
                //如果返回值是null，说明该字符在集合中不存在，就把该字符作为键，1为值储存
                hm.put(key,1);
            }else{
                //如果返回值不是null，说明该字符在集合中存在，值加一，重新存储键值
                value++;
                hm.put(key,value);
            }
        }

        //遍历集合，按照要求进行拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for(Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("("+ value + ")");
        }


        String s = sb.toString();
        System.out.println(s);
    }
}
