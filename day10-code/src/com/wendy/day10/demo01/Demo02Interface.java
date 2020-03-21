package com.wendy.day10.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 17:57
 */
/*
* 1、接口的默认方法，可以通过接口实现类对象，直接调用。
* 2、接口的默认方法，也可以被接口实现类进行覆盖重写。
* */
public class Demo02Interface {

    public static void main(String[] args) {
        //创建了实现类对象
        MyinterfaceDefaultA a = new MyinterfaceDefaultA();
        a.methodAbs();//调用抽象方法，实现运行地是右侧实现类。

        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();

        MyinterfaceDefaultB b = new MyinterfaceDefaultB();
        b.methodAbs(); //实现了抽象方法，B
        b.methodDefault(); //实现类B覆盖重写了接口的默认方法
    }
}
