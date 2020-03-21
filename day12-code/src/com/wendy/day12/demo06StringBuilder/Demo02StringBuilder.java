package com.wendy.day12.demo06StringBuilder;

/**
 * Author : wendy_wan
 * Created : 2020/3/18 11:12
 */
/*
    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class Demo02StringBuilder {

    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();

/*        //append方法返回地是this，调用方法地对象bu。。this == bu
        StringBuilder bu2 = bu.append("abc");
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu == bu2);*/

/*    //使用append方法无需接收返回值
        bu.append("abc");
        bu.append(1);
        bu.append(true);
        bu.append(8.8);
        bu.append('完');
        System.out.println(bu);
        */
        /*
        * 链式编程：方法返回值是一个对啊ing，可以继续调用方法
        * */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        bu.append("abc").append(1).append(true).append(8.8).append('完');
        System.out.println(bu);
    }
}
