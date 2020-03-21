package com.wendy.day12.demo01.Object;

import java.util.Objects;

/**
 * Author : wendy_wan
 * Created : 2020/3/18 8:16
 */
public class Demo03Object {

    public static void main(String[] args) {
        //String s1 = null;
        String s1 = "abc";
        String s2 = "abc";
        //java.lang.NullPointerException, null是不能调用方法的，就会抛出空指针异常
       // boolean b = s1.equals(s2);
      //  System.out.println(b);

        /**
         * Object类的equals方法：对两个对象进行比较，防止空指针异常
         * public static boolean equals(Object a, Object b) {
         *     return (a == b) || (a != null && a.equals(b));
         * }
         */

        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);
    }
}
