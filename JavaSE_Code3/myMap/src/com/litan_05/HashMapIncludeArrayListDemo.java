package com.litan_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new  HashMap<String, ArrayList<String>>();

        ArrayList<String> tk = new ArrayList<String>();
        tk.add("诸葛亮");
        tk.add("赵云");
        hm.put("ThreeKingdoms",tk);

        ArrayList<String> jw = new ArrayList<String>();
        jw.add("唐僧");
        jw.add("孙悟空");
        hm.put("Journey to the West",jw);

        ArrayList<String> wm = new ArrayList<String>();
        wm.add("武松");
        wm.add("鲁智深");
        hm.put("Water Margin",wm);

        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            System.out.println(key );
            ArrayList<String> value = hm.get(key);
            for(String s:value){
                System.out.println("\t" + s);
            }
        }


    }
}
