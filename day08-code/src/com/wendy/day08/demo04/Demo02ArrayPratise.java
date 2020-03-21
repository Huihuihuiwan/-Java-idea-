package com.wendy.day08.demo04;

import java.util.Arrays;

/**
 * Author : wendy_wan
 * Created : 2020/3/15 14:43
 */

/*
* 题目：
* 请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 * */
public class Demo02ArrayPratise {
    public static void main(String[] args) {
        String str = "acvsdsafjik7432";
        /*
        * 如何进行升序排列：sort
        * 必须是一个数组，才能用Array.sort方法
        * String --> 数组。用toCharArray
        * */

        char[] chars = str.toCharArray();
        Arrays.sort(chars); //对字符数组进行升序排序

        //需要倒序遍历
        //使用chars.forr生成倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
