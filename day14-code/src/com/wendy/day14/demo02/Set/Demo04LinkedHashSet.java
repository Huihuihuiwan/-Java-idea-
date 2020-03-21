package com.wendy.day14.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Author : wendy_wan
 * Created : 2020/3/19 16:21
 */

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class Demo04LinkedHashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("www");
        set.add("wendy");
        System.out.println(set); //[abc, www, wendy] 无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("wendy");
        System.out.println(linked); //[www, abc, wendy]有序，不允许重复
    }
}
