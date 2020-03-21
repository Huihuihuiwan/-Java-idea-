package com.wendy.day05.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/1 20:56
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
