package com.litan_06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"aol,15", "bxa,35", "ccg,38", "dd,28"};

        ArrayList<String> array = myFilter(strArray, str -> str.split(",")[0].length() > 2,
                str -> Integer.parseInt(str.split(",")[1]) > 33);

        for (String str : array) {
            System.out.println(str);
        }
    }

    //通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList集合中
    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        //定义一个集合
        ArrayList<String> array = new ArrayList<String>();

        //遍历数组
        for (String str : strArray) {
            if (pre1.and(pre2).test(str)) {
                array.add(str);
            }
        }

        return array;
    }
}
