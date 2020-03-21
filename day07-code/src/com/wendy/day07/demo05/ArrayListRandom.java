package com.wendy.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 20:21
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
