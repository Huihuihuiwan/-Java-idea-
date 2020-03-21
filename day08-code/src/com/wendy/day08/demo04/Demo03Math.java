package com.wendy.day08.demo04;

/**
 * Author : wendy_wan
 * Created : 2020/3/15 14:50
 */
/*
* java.lang.Math类是数学相关的工具，里面提供了大量的静态方法，完成于数学运算相关的操作
* 类包含用于执行基本数学运算的方法
*
* public static double abs(double a) ：返回 double 值的绝对值
* public static double ceil(double a) ：向上取整。返回大于等于参数的小的整数
* public static double floor(double a) ：向下取整。返回小于等于参数大的整数
* public static long round(double a) ：返回接近参数的 long。(相当于四舍五入方法)
*
* Math.PI代表近似的圆周率常量（double）
 * */
public class Demo03Math {
    public static void main(String[] args) {
        //获得绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("=========");

        //向上取整
        System.out.println(Math.ceil(3.9)); //4.0
        System.out.println(Math.ceil(3.1)); //4.0
        System.out.println(Math.ceil(3.0)); //3.0
        System.out.println("=========");

        //向下取整
        System.out.println(Math.floor(30.1)); //30.0
        System.out.println(Math.floor(30.9)); //30.0
        System.out.println(Math.floor(31.0)); //31.0
        System.out.println("=========");

        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.5));
    }
}
