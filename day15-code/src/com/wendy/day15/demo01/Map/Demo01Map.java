package com.wendy.day15.demo01.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : wendy_wan
 * Created : 2020/3/19 17:39
 */
/*
    java.util.Map<k,v>集合
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是一一对应

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
        2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
   LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {

    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }
    /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false
     */
    private static void show04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("qq",169);
        map.put("ww",165);
        map.put("ee",178);

        boolean b1 = map.containsKey("qq");
        System.out.println(b1); //true

        boolean b2 = map.containsKey("aa");
        System.out.println(b2); //false
    }

    /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
     */
    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("qq",169);
        map.put("ww",165);
        map.put("ee",178);

        Integer v1 = map.get("qq");
        System.out.println(v1); //169

        Integer v2 = map.get("aa");
        System.out.println(v2); //null
    }

    /*
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值:V
                key存在,v返回被删除的值
                key不存在,v返回null
     */
    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("qq",169);
        map.put("ww",165);
        map.put("ee",178);
        System.out.println(map); //{qq=169, ww=165, ee=178}

        Integer v1 = map.remove("qq");
        System.out.println(v1); //169
        System.out.println(map);

        Integer v2 = map.remove("vv");
        System.out.println(v2);  //null
        System.out.println(map);
    }

    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候,key不重复,返回值V是null
                存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
     */
    private static void show01() {
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("aa", "aaa1");
        System.out.println("v1:" + v1);

        String v2 = map.put("aa", "aaa1");
        System.out.println("v2: " + v2);

        System.out.println(map);

        map.put("bb","bbb1");
        map.put("cc","ccc1");
        map.put("dd","bbb1");
        System.out.println(map);
        System.out.println("==============");
    }

}
