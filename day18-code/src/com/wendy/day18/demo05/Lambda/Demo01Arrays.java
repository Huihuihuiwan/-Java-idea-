package com.wendy.day18.demo05.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author : wendy_wan
 * Created : 2020/3/21 11:00
 */
/*
    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo01Arrays {

    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
            new Person("柳岩", 38),
            new Person("迪丽热巴",28),
            new Person("古力娜扎",29)
        };
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边-后边)排序
/*        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用Lambda表达式简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //优化省略Lambda
        Arrays.sort(arr, ( o1, o2) -> o1.getAge() - o2.getAge());

        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
