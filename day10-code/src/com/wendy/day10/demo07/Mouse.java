package com.wendy.day10.demo07;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 10:04
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
