package com.wendy.day07.demo04;

import java.util.ArrayList;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 20:08
 */
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
