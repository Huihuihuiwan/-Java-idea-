package com.wendy.day05.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/1 20:05
 */

/*
遍历数组，说的就是对数组当中的每一个元素进行逐一、挨个儿处理，默认的处理方式就是打印输出。

* */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 25, 30, 40, 50,60};

        //使用循环，次数其实就是数组的长度
        //5.fori快捷键
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        //array.fori快捷键
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
