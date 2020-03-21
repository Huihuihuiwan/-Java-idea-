package com.wendy.day10.demo06;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 9:15
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //子类特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
