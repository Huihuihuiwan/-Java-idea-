package com.wendy.day18.demo03.Lambda;

/**
 * Author : wendy_wan
 * Created : 2020/3/21 10:13
 */
/*
    创建Runnable接口的实现类,重写run方法,设置线程任务
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程创建了");
    }
}
