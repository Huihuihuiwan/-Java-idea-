package com.wendy.day04.demo4;

/*
    重载
* 题目要求：
* 比较两个数据是否相等
* 参数类型分别是byte类型，两个short类型，两个int类型，两个long类型
* 并且再main方法中进行测试。
* */
public class Demo02MethodOverloadSame {

    public static void main(String[] args) {
        byte a =10;
        byte b = 20;
        System.out.println(isSame(a,b));

        System.out.println(isSame((short)a,(short)b));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,10L));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println(" two byte ");
        boolean same;
        if (a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println(" two short ");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b){
        System.out.println(" two int ");
        return a==b;
    }

    public static boolean isSame(long a, long b){
        System.out.println(" two long ");
        if (a == b){
            return true;
        }else{
            return false;
        }
    }
}
