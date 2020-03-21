package com.wendy.day16.demo03.Exception;

/**
 * Author : wendy_wan
 * Created : 2020/3/20 15:10
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a = 100;
            return a;
        }
    }
}
