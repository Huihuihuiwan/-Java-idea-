package com.wendy.day11.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 12:23
 */
/*
* 对于成员变量具有默认值，所以用了final之后就必须手动赋值，不会再给默认值了
* 2、对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。
* 3、必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
* */
public class Person {
    private final String name /*= "aaa"*/;

    public Person() {
        name = "aaa";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

/*    public void setName(String name) {
        this.name = name;
    }*/
}
