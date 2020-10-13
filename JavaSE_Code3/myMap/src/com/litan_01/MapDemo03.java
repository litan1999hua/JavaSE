package com.litan_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("hfut001","林青霞");
        map.put("hfut002","周星驰");
        map.put("hfut003","成龙");

//        System.out.println(map.get("hfut001"));
//        System.out.println(map.get("hfut004"));

        Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }

        Collection<String> values = map.values();
        for(String s:values){
            System.out.println(s);
        }
    }
}
