package com.wendy.day13.demo03.Generic;

/**
 * Author : wendy_wan
 * Created : 2020/3/18 18:28
 */
public class Demo02GenericClass {

    public static void main(String[] args) {
        //不写默认是Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小米");
        String name1 = gc3.getName();
        System.out.println(name1);

/*
        String name = gc.getName();
        System.out.println(name);*/
    }
}
