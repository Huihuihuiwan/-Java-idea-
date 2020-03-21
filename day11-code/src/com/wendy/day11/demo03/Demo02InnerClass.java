package com.wendy.day11.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 15:36
 */

public class Demo02InnerClass {

    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
