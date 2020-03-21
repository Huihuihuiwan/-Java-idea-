package com.wendy.day10.demo07;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 10:04
 */
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
