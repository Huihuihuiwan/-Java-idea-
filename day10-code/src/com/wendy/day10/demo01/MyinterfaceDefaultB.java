package com.wendy.day10.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 17:51
 */
public class MyinterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，B");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
