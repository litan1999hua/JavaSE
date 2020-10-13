package com.litan_06;

import java.util.function.Predicate;

/*
    default Predicate<T> and​(Predicate<? super T> other)
    返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑AND。

    default Predicate<T> or​(Predicate<? super T> other)
    返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑或。
 */
public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean b1 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b1);

        boolean b2 = checkString("helloworld",s -> s.length()>5,s -> s.length()<15);
        System.out.println(b2);

        boolean b3 = checkString("helloworld",s -> s.length()>5,s -> s.length()<10);
        System.out.println(b3);
    }

    //同一个字符串给出两个不同的判断条件，最后把这两个判断的结果做逻辑运算的结果返回
    private static boolean checkString(String s,Predicate<String> pre1,Predicate<String> pre2){
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        boolean b = b1&&b2;
//        boolean b = pre1.and(pre2).test(s);
        boolean b = pre1.or(pre2).test(s);
        return b;
    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }
}
