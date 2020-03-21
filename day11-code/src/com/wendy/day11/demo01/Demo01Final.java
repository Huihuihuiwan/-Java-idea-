package com.wendy.day11.demo01;

import java.sql.Struct;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 10:42
 */
/*
* final关键字代表最终、不可改变的
*
* 常见的四种用法：
* 1、可以用来修饰一个类
* 2、可以用来修饰一个方法
* 3、还可以用来修饰一个局部变量
* 4、还可以用来修饰一个成员变量
* */
public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        //“一次赋值，终身不变”
        final int num2 = 200;
        System.out.println(num2);

//        num2 = 200; //错误写法，不能改变

        final int num3;
        num3 = 30;

        /*
        * 对于基本类型来说，不可变说的是变量当中的数据不可改变
        * 对于引用类型来说，不可变说的是变量当中的地址值不可改变
        * */

        Student stu1 = new Student("aaaa");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        stu1 = new Student("bbb");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        System.out.println("=============");
        final Student stu2 = new Student("ccc");
        System.out.println(stu2.getName());
        stu2.setName("acsc");
        System.out.println(stu2.getName());
    }
}
