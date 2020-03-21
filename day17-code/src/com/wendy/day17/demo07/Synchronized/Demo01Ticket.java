package com.wendy.day17.demo07.Synchronized;

/**
 * Author : wendy_wan
 * Created : 2020/3/20 17:36
 */
/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
 */
public class Demo01Ticket {

    public static void main(String[] args) {
        //创建一个Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建一个实现类，传递给三个Thread
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //调用start方法开启线程
        t0.start();
        t1.start();
        t2.start();
    }
}
