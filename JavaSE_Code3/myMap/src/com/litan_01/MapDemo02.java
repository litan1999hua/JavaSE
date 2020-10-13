package com.litan_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("hfut001","林青霞");
        map.put("hfut002","周星驰");
        map.put("hfut003","成龙");

//        System.out.println(map.remove("hfut001"));
//        System.out.println(map.remove("hfut004"));

//        map.clear();

//        System.out.println(map.containsKey("hfut001"));
//        System.out.println(map.containsKey("hfut004"));

//        System.out.println(map.containsValue("成龙"));
//        System.out.println(map.containsValue("成龙2"));

//        System.out.println(map.isEmpty());

//        System.out.println(map.size());

        System.out.println(map);
    }
}
