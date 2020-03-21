package com.wendy.day10.demo06;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 9:25
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
