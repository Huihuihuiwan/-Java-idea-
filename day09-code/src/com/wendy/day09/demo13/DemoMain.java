package com.wendy.day09.demo13;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 16:33
 */
public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();//错误，是抽象类
//        Dog dog = new Dog(); // 错误，这也是抽象类

        Dog2Ha ha = new Dog2Ha(); //这是普通类，可以直接new对象
        ha.eat();
        ha.sleep();
        System.out.println("==========");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }
}
