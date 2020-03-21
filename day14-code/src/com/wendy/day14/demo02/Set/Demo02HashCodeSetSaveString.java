package com.wendy.day14.demo02.Set;


import java.util.HashSet;

/**
 * Author : wendy_wan
 * Created : 2020/3/19 15:35
 */
/*
* Set集合不允许存储重复元素的原理
* */
public class Demo02HashCodeSetSaveString {

    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();

        String s1 = "abc";
        String s2 = "abc";
//        String s2 = new String("abc");

        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");

        System.out.println(set);
    }
}
