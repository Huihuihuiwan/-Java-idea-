package com.wendy.day06.demo04;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 11:00
 */
/*
* 当方法的局部变量和类的成员变量重名的时候，根据”就近原则“，优先使用局部变量
* 如果粗腰访问本类当中的成员变量，需要使用格式
* this.成员变量名
*
* ”通过谁调用的方法，谁就是this."
* */
public class Person {
    String name;

    public void sayHello(String name){
        System.out.println(name + ",我是你的儿子" + this.name);
        System.out.println(this);
    }
}
