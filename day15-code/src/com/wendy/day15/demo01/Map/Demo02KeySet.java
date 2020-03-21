package com.wendy.day15.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author : wendy_wan
 * Created : 2020/3/19 21:16
 */
/*
    Map集合的第一种遍历方式:通过键找值的方式
    Map集合中的方法:
         Set<K> keySet() 返回此映射中包含的键的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        2.遍历set集合,获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value
 */
public class Demo02KeySet {

    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",165);
        map.put("杨颖",178);
        map.put("林志林",198);

       // 1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.遍历set集合,获取Map集合中的每一个key
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();

            //3.通过Map集合中的方法get(key),通过key找到value
            Integer value = map.get(key);

            System.out.println(key + " = " +value);

            System.out.println("====================");

            for (String key1 : set) {
                Integer value1 = map.get(key1);
                System.out.println(key + " = " +value);
            }
        }
    }
}
