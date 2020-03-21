package com.wendy.day07.demo04;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 18:37
 */
/*
* 题目：定义一个数组，用来存储3个Person对象。
* 数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变
* */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("one",10);
        Person two = new Person("two",23);
        Person three = new Person("three",35);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        //打印的都是地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());
    }
}
