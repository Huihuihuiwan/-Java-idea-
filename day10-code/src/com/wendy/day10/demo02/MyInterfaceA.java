package com.wendy.day10.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 21:35
 */
public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }

}
