package com.wendy.day05.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/1 21:01
 */
public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值为：" + min);
    }
}
