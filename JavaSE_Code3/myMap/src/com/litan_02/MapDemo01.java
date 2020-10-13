package com.litan_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    1.keySet()获取所有的键
    2.for遍历集合
    3.get()根据键找到对应的值
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("hfut001","林青霞");
        map.put("hfut002","周星驰");
        map.put("hfut003","成龙");

        //keySet()获取所有的键
        Set<String> keySet = map.keySet();

        //遍历集合
        for(String key:keySet){
            //根据键找到对应的值
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
