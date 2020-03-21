package com.wendy.day15.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Author : wendy_wan
 * Created : 2020/3/19 22:04
 */
/*
    java.util.LinkedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {

    public static void main(String[] args) {
HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        //key不允许重复，无序
        System.out.println(map); //{a=d, b=b, c=c}

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","d");
        //key不允许重复，有序
        System.out.println(linked); //{a=d, c=c, b=b}


    }
}
