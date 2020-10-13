package com.litan_01;

import java.util.HashMap;
import java.util.Map;

/*
    public interface Map<K,V>将键映射到值的对象。
    地图不能包含重复的键; 每个键可以映射到最多一个值。

    public class HashMap<K,V>
   extends AbstractMap<K,V>
    implements Map<K,V>,基于哈希表的实现的Map接口。 该实现提供了所有可选的映射操作，并允许null值和null密钥。

     put​(K key, V value) 将指定的值与该映射中的指定键相关联（可选操作）。
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建对象
        Map<String,String> map = new HashMap<String,String>();

        //V put​(K key, V value) 将指定的值与该映射中的指定键相关联（可选操作）。
        map.put("hfut001","林青霞");
        map.put("hfut002","成龙");
        map.put("hfut003","周星驰");
        map.put("hfut001","周润发");

        System.out.println(map);
    }
}
