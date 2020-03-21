package com.wendy.day09.demo13;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 16:05
 */
//子类也是一个抽象类
public abstract class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
