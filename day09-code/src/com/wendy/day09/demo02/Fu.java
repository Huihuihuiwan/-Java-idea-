package com.wendy.day09.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 8:29
 */
public class Fu {
    int numFu = 10;
    int num = 100;

    public void methodFu(){
        //使用本类当中的，不会向下找子类
        System.out.println(num);
    }
}
