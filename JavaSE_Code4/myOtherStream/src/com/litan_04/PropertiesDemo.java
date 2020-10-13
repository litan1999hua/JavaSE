package com.litan_04;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        //创建集合对象
//        Properties<String,String> prop = new Properties<String,String>();//false
        Properties prop = new Properties();

        //存储元素
        prop.put("hfut001", "林青霞");
        prop.put("hfut002", "周星驰");
        prop.put("hfut003", "刘德华");

        //遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
