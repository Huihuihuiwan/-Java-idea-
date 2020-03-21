package com.wendy.day09.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 9:01
 */
public class Zi extends Fu {
    int num = 20;

    public void method(){
        int num = 30;
        System.out.println(num); //30局部变量
        System.out.println(this.num); //20 , 本类中的成员变量
        System.out.println(super.num); //10, 父类的成员变量
    }
}
