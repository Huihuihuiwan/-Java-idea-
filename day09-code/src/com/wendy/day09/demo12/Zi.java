package com.wendy.day09.demo12;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 15:18
 */
public class Zi extends Fu {
    public Zi(){
        //super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("chichichi");
    }
}
