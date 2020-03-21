package com.wendy.day05.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/1 15:42
 */

/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值。

访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号
【注意】索引值从0开始，一直到“数组的长度-1”为止
* */
public class Demo04ArrayUse {

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("=========");

        int num = array[1];
        System.out.println(num);

    }


}
