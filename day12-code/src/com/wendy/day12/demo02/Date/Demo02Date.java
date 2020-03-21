package com.wendy.day12.demo02.Date;

import java.util.Date;

/**
 * Author : wendy_wan
 * Created : 2020/3/18 9:05
 */
public class Demo02Date {
    public static void main(String[] args) {
       // demo01();
       // demo02();
        demo03();
    }

    /*
    * long getTime()把日期转换成毫秒值（相当于System.currentTimeMillis()方法）
    * 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
    * */
    private static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo02(){
        Date date = new Date(0L);
        System.out.println(date); //Thu Jan 01 08:00:00 CST 1970
    }
    /**
     * Date()类的空参数构造方法
     * Date（）获取当前系统的日期和时间
     */
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);//Wed Mar 18 09:10:33 CST 2020
    }
}
