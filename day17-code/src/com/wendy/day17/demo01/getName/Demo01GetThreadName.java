package com.wendy.day17.demo01.getName;

/**
 * Author : wendy_wan
 * Created : 2020/3/20 16:31
 */
/*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
 */
public class Demo01GetThreadName {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();

        //调用start方法，开启新线程，执行run方法
        mt.run();

        new MyThread().start();
        new MyThread().start();

        //链式编程,由于main方法没有继承Thread，所以不能直接使用getName
        //只能通过currentThread来获得线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
