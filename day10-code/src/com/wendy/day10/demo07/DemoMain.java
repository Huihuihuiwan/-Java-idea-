package com.wendy.day10.demo07;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 10:06
 */
public class DemoMain {

    public static void main(String[] args) {
        //首先创建一个笔记本
        Computer computer = new Computer();
        computer.powerOn();
        /*
        * 准备一个鼠标，供电脑使用
        * 首先进行向上转型
        * */
        USB usbMouse = new Mouse(); //多态写法
        //参数是USB类型，传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard(); //没有使用多态的写法
        //参数是USB类型，传递进去的实现类对象
        computer.useDevice(keyboard); //正确写法，也发生了向上转型

        //使用子类对象，匿名对象，也可以
//        computer.useDevice(new Keyboard()); //正确写法

        computer.powerOff();

        System.out.println("===============");

        method(10.0); //double--->double
        method(20); //int --->double
        int a = 30;
        method(a); //int ---> double
    }
    public static void method(double num){
        System.out.println(num);
    }
}
