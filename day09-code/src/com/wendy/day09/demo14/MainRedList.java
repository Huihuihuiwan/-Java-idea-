package com.wendy.day09.demo14;

import java.util.ArrayList;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 17:14
 */
public class MainRedList {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("成员A ",0);
        Member two = new Member("成员B ",0);
        Member three = new Member("成员C ",0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=========");

        ArrayList<Integer> redList = manager.send(20,3);

        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
