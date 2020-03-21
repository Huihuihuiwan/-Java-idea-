package com.wendy.day11.demo05;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 16:19
 */
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method1() {
        System.out.println("实现类覆盖重写了方法！111");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写了方法！222");
    }
}
