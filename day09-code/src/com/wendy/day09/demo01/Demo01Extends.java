package com.wendy.day09.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 8:04
 */
/*
* 在继承的关系中，“子类就是一个父类”，也就是，子类可以被当做父类看待。
*
* 定义父类的格式：（一个普通的类定义）
* public class 父类名称 {
*       //...     
* }  
*
* 定义子类的格式：
* class 子类名称 extends 父类名称 {
*       //...     
* }
* */
public class Demo01Extends {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.method();

        Assistant assistant = new Assistant();
        assistant.method();
    }
}
