package com.wendy.day07.demo03;

import java.util.Random;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 18:21
 */
public class Demo03Random {
    public static void main(String[] args) {
        int num = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(num) + 1; //范围：[1,num]
            System.out.println(result);
        }
    }
}
