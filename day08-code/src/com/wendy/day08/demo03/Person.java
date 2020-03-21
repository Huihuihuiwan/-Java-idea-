package com.wendy.day08.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/15 14:20
 */

public class Person {
    static {
        System.out.println("静态代码块执行！");
    }

    public Person(){
        System.out.println("构造方法执行！");
    }
}
