package com.wendy.day07.demo03;

import java.util.Random;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 18:19
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
