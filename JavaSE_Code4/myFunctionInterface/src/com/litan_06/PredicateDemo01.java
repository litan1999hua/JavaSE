package com.litan_06;

import java.util.function.Predicate;

/*
    boolean test​(T t) 在给定的参数上评估这个谓词。

    default Predicate<T> negate​() 返回表示此谓词的逻辑否定的谓词。
 */
public class PredicateDemo01 {
    public static void main(String[] args) {

//        boolean b1 = checkString("Hello", (String s) -> {
//            return s.length() > 8;
//        });
//        System.out.println(b1);
        System.out.println(checkString("hello", s -> s.length() > 8));

        boolean b2 = checkString("helloworld",s -> s.length()>8);
        System.out.println(b2);

    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);
//        return !pre.test(s);
        return  pre.negate().test(s);
    }

}
