package com.wendy.day16.demo06.Thread;

/**
 * Author : wendy_wan
 * Created : 2020/3/20 16:10
 */

//1.创建一个Thread类的子类
public class MyThread extends Thread {
    //2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("run ： " + i);
        }
    }
}
