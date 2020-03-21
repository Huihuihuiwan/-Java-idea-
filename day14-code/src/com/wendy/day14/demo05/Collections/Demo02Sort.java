package com.wendy.day14.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author : wendy_wan
 * Created : 2020/3/19 16:45
 */

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
        参数-自己(this):升序
 */
public class Demo02Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        Collections.sort(list01); //默认是升序
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);

        Collections.sort(list02); //默认是升序
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("aa",10));
        list03.add(new Person("cc",14));
        list03.add(new Person("bb",40));
        System.out.println(list03);

        Collections.sort(list03);
        System.out.println(list03);


    }
}
