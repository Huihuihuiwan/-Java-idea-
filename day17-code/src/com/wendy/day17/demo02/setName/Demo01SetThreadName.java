package com.wendy.day17.demo02.setName;

/**
 * Author : wendy_wan
 * Created : 2020/3/20 16:43
 */
public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("aaa");
        mt.start();

        //开启多线程
        new MyThread("vbb").start();
    }
}
