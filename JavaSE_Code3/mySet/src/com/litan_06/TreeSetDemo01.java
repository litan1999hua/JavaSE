package com.litan_06;

import java.util.TreeSet;

/*
    TreeSet集合特点
        1.元素有序，按照一定的规则排序
            TreeSet():根据其元素的自然排序进行排序
            TreeSet(Comparator comparator):根据指定的比较器进行排序
        2.没有带索引，所以不能使用普通for进行遍历
        3.是Set集合，所以元素不能重复
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts = new TreeSet<Integer>();

        //添加元素
        ts.add(10);
        ts.add(15);
        ts.add(55);
        ts.add(0);
        ts.add(15);

        //遍历
        for(Integer i:ts){
            System.out.println(i);
        }
    }
}
