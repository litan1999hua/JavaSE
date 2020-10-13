package com.litan_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> hm1 = new HashMap<String,String>();

        hm1.put("项羽","虞姬");
        hm1.put("刘邦","吕雉");
        array.add(hm1);

        HashMap<String,String> hm2 = new HashMap<String,String>();

        hm2.put("刘秀","阴丽华");
        hm2.put("司马相如","卓文君");
        array.add(hm2);

        HashMap<String,String> hm3 = new HashMap<String,String>();

        hm3.put("刘彻","陈阿娇");
        hm3.put("刘骜","赵飞燕");
        array.add(hm3);


        for(HashMap<String,String> hm:array){
            Set<String> keySet = hm.keySet();
            for(String key:keySet){
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }
    }
}
