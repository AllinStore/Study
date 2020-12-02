package com.allin.study.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("001","A");
        map.put("002","B");
        map.put("003","C");
        map.put("004","D");
        map.put("004","ff");

        Set<String> keys = map.keySet();
        //遍历set集合
        for (String key : keys) {
            System.out.println(key);
        }

        //获取map集合中的所有的值
        Collection<String> values = map.values();
        //遍历
        for (String value : values) {
            System.out.println(value);
        }

       /* String name = map.put("004","ffff");

        System.out.println("name = " + name);

        System.out.println("map = " + map);

        String string = map.remove("004");
        System.out.println("string = " + string);

        *//*map.clear();
        System.out.println("map = " + map);*//*

        System.out.println(map.size());*/
    }
}
