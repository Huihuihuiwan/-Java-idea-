package com.wendy.day17.demo06.ThreaSafe;

/**
 * Author : wendy_wan
 * Created : 2020/3/20 17:36
 */
/*
* 实现卖票案例
* */
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true){
            //先判断票是否存在
            if (ticket > 0){
                //提高安全问题出现的概率，让程序睡眠
                /**
                * 打印相同的重复票：
                 *      多个线程同时执行到sout语句，这个时候ticket还没有执行--
                 *
                 * 打印-1 0 1的票：
                 *      线程执行到sleep时，就失去了cpu的执行权，所以sleep执行完之后，
                 *      可能别的进程已经执行ticket--，导致出现负数
                * */
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在，卖票
                System.out.println(Thread.currentThread().getName() + "--->正在卖票" + ticket + "张票");
                ticket--;
            }
        }
    }
}
