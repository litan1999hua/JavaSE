package com.litan_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    1.获取所有键值对象的集合Set<Map.Entry<K,V>> entrySet​()
    2.遍历键值对象的集合，得到每一个键值对象
        增强for，得到每一个Map.Entry
    3.根据键值对象，获取键和值
        K getKey​() 返回与此条目相对应的键。
        V getValue​() 返回与此条目相对应的值。

 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //添加元素
        map.put("hfut001","林青霞");
        map.put("hfut002","周星驰");
        map.put("hfut003","成龙");

        //获取所有键值对象的集合Set<Map.Entry<K,V>> entrySet​()
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(map.entrySet());
        //遍历键值对象的集合，得到每一个键值对对象
        //增强for，得到每一个Map.Entry
//        for(Map.Entry<String, String> me:entrySet){
//            //根据键值对对象，获取键和值
//            String key = me.getKey();
//            String value = me.getValue();
//            System.out.println(key + "," + value);
//        }
    }
}
