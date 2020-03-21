package com.wendy.day10.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 21:53
 */
public interface MyInterface {
    public default void method(){
        System.out.println("接口的默认方法");
    }
}
