package com.wendy.day05.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/1 19:46
 */
/*
* 数组的索引编号是从0开始，一直到“数组的长度-1”为止。
* 如果访问数组元素的时候，索引编号并不存在，那么将会发生数组索引越界异常
* ArrayIndexOutOfBoundsException
*
* 原因：索引编号写错了
* 解决：修改成为存在的正确索引编号
* */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15, 25, 35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[3]);
    }
}
