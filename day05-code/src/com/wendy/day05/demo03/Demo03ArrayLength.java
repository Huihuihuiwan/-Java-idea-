package com.wendy.day05.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/1 19:56
 */

/*
如何获取数组的长度，格式：数组名称.length
这将会得到一个int数字，代表数组的长度。

数组一旦创建，程序运行期间，长度不可改变。
* */
public class Demo03ArrayLength {

    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20 ,30, 34, 45, 2 ,23, 43, 43, 23,54, 65, 76, 23};

        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);
        System.out.println("==========");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);

        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
