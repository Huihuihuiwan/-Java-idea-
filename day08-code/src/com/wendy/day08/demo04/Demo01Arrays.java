package com.wendy.day08.demo04;

import java.util.Arrays;

/**
 * Author : wendy_wan
 * Created : 2020/3/15 14:29
 */
/*
* java.util.Arrays 是一个与数组相关地工具类，里面提供了大量的静态方法，用来实现数组常见的操作。
* 此类包含用来操作数组的各种方法，比如排序和搜索等。
* 其所有方法均为静态方法，调用起来 非常简单。
*
* public static String toString(int[] a) ：
* 将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3....]
* 返回指定数组内容的字符串表示形式。
*
*
* public static void sort(int[] a) ：
* 按照默认升序（从小到大）对数组的元素进行排序。
* 对指定的 int 型数组按数字升序进行排序。
*
* 备注：
* 1、如果是数值，sort默认按照升序从小到大
* 2、如果是字符串，sort默认按照字母升序
* 3、如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {1, 2, 12, 3 ,0};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"aaa","ccc","bbbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
