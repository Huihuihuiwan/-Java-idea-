package com.wendy.day18.demo01.WaitAndNotify;

/**
 * Author : wendy_wan
 * Created : 2020/3/21 9:14
 */
public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程，开启生产包子
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
