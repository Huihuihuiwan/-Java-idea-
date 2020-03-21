package com.wendy.day12.demo01.Object;

import java.util.ArrayList;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 18:03
 */
public class Demo02Equals {

    public static void main(String[] args) {
        /**
        Person类默认继承了Object类，所以可以使用Object类地equals方法，
        boolean equals(Object obj)指示其他某个对象是否与此对象“相等”

         equals方法地源码：
             public boolean equals(Object obj) {
                return (this == obj);
             }
         参数：
            Object obj：可以传递任意地对象
            基本数据类型：比较的是值
            引用数据类型：比较的是两个对象的地址值

         this是谁？哪个对象调用的方法，方法中的this就是那个对象
         p1调用方的是equals方法，所以this就是p1

         obj是谁？传递过来的参数p2
         this == obj  --->  p1 == p2
         */
        Person p1 = new Person("aaa",18);
        Person p2 = new Person("bbb",19);
        System.out.println("p1" + p1); //p1com.wendy.day12.Person@2d93b2
        System.out.println("p2" + p2); //p2com.wendy.day12.Person@2e0bf2

//        p1 = p2;
        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(list);
        System.out.println(b);

    }
}
