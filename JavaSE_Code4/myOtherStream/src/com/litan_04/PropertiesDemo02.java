package com.litan_04;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为集合的特有方法
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //设置集合的键和值
        prop.setProperty("hfut001","林青霞");
        /*
            Object setProperty(String key, String value) {
                return put(key, value);
            }

            public synchronized Object put(Object key, Object value) {
                return map.put(key, value);
            }
         */
        prop.setProperty("hfut002","刘德华");
        prop.setProperty("hfut003","周星驰");

        //根据集合的键返回指定的值
//        System.out.println(prop.getProperty("hfut001"));
//        System.out.println(prop.getProperty("hfut001d"));


//        System.out.println(prop);

        //Set<String> stringPropertyNames():从该属性列表中返回一个不可修改的键集，其中键的对应值是字符串
        Set<String> names = prop.stringPropertyNames();
        for(String key:names){
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }
    }
}
