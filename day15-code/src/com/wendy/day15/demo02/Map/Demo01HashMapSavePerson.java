package com.wendy.day15.demo02.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author : wendy_wan
 * Created : 2020/3/19 21:46
 */
/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class Demo01HashMapSavePerson {

    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
     */
    private static void show02() {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",18),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        Set<Map.Entry<Person, String>> set = map.entrySet();

        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }

    /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            value可以重复(同名同年龄的人视为同一个)
     */
    private static void show01() {
       //创建HashMap集合,已经重写了toString方法，保证了key唯一，key一样，后面的值覆盖前面的值
        HashMap<String,Person> map = new HashMap<>();
        map.put("北京",new Person("张三", 18));
        map.put("上海",new Person("李四", 19));
        map.put("广州",new Person("王五", 20));
        map.put("北京",new Person("赵六", 18));

        Set<String> set = map.keySet();

        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("=============================");
    }
}
