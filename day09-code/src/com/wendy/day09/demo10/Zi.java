package com.wendy.day09.demo10;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 14:40
 */
public class Zi extends Fu{

    int num = 20;

    @Override
    public void method() {
        super.method(); //调用父类的方法
        System.out.println("子类方法");
    }

    public void show(){
        int num = 30;
        System.out.println(num); //30
        System.out.println(this.num); //20
        System.out.println(super.num); //10
    }
}
