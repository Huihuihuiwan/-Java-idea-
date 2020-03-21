package com.wendy.day10.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 21:35
 */
public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
